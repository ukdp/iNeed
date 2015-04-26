/**
 * 
 */
package com.startup.ineed.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.startup.ineed.delegate.UserManagementDelegate;
import com.startup.ineed.exception.INeedServiceException;
import com.startup.ineed.model.LoginModel;

/**
 * @author darshanpal
 * 
 */
@Controller
public class UserManagementController {

	private static final Logger LOGGER = Logger
			.getLogger(UserManagementController.class);

	@Autowired
	UserManagementDelegate userManagementDelegate;

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(@ModelAttribute("loginModel") LoginModel loginModel) {
		return "login";

	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String authenticate(
			@ModelAttribute("loginModel") LoginModel loginModel) {

		String responsePage = null;
		System.out.println(loginModel.getUserName());
		System.out.println(loginModel.getPassword());
		System.out.println(loginModel.getRememberMe());
		String response = null;
		try {
			response = userManagementDelegate.authenticate(loginModel);
		} catch (INeedServiceException e) {
			response = "false";
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if ("true".equals(response)) {
			loginModel.setWelcomeMessage("Welome To home Page");
			responsePage = "home";
		} else {
			loginModel.setErrorMessage("YOu are not authenticated");
			responsePage = "login";
		}
		return responsePage;
	}
}
