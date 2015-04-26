/**
 * 
 */
package com.startup.ineed.delegate;

import org.springframework.beans.factory.annotation.Autowired;

import com.startup.ineed.exception.INeedServiceException;
import com.startup.ineed.model.LoginModel;
import com.startup.ineed.service.UserManagementService;

/**
 * @author darshanpal
 * 
 */
public class UserManagementDelegateImpl implements UserManagementDelegate {

	@Autowired
	UserManagementService userManagementService;

	public String authenticate(LoginModel loginModel)
			throws INeedServiceException {

		return userManagementService.authenticate(loginModel);

	}

}
