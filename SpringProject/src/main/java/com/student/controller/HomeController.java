package com.student.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.student.verify.VerifyRecaptcha;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView getIndexPage() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

	@RequestMapping(value = "/LoginServlet", method = RequestMethod.POST)
	public ModelAndView getServletPage(HttpServletRequest request, HttpServletResponse response) {

		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		// get reCAPTCHA request param
		String gRecaptchaResponse = request.getParameter("g-recaptcha-response");
		System.out.println(gRecaptchaResponse);
		boolean verify = false;
		try {
			verify = VerifyRecaptcha.verify(gRecaptchaResponse);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("User=" + user + "::password=" + pwd + "::Captcha Verify " + verify);
		if (verify) {
			// response.sendRedirect("LoginSuccess");
			ModelAndView mv = new ModelAndView("LoginSuccess");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("home");
			return mv;
		}

	}
}
