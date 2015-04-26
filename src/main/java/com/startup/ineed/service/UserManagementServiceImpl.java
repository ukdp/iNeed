/**
 * 
 */
package com.startup.ineed.service;

import com.startup.ineed.exception.INeedServiceException;
import com.startup.ineed.model.LoginModel;

/**
 * @author darshanpal
 * 
 */
public class UserManagementServiceImpl implements UserManagementService {

	public String authenticate(LoginModel loginModel)
			throws INeedServiceException {

		if ("darshan".equalsIgnoreCase(loginModel.getUserName())
				&& "abc@123".equals(loginModel.getPassword())) {
			return "true";
		} else {
			return "false";
		}
	}
}
