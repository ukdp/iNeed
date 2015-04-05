/**
 * 
 */
package com.startup.ineed.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.startup.ineed.model.LoginModel;

/**
 * @author darshanpal
 *
 */
@Controller
public class UserManagementController {

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login() {
		return "login";

	}
	
	@RequestMapping(value="/loginreq",method = RequestMethod.POST)
	public String welcome(HttpSession session,HttpServletRequest httpServletReq,@ModelAttribute("loginModel") LoginModel loginModel) {
		System.out.println(loginModel.getUserName());
		System.out.println(loginModel.getPassword());
		System.out.println(loginModel.getRememberMe());
		return "";

	}
}
