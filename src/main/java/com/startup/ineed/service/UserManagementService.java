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
public interface UserManagementService {

	public String authenticate(LoginModel loginModel)
			throws INeedServiceException;

}
