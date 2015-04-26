/**
 * 
 */
package com.startup.ineed.delegate;

import com.startup.ineed.exception.INeedServiceException;
import com.startup.ineed.model.LoginModel;

/**
 * @author darshanpal
 * 
 */
public interface UserManagementDelegate {

	public String authenticate(LoginModel loginModel)
			throws INeedServiceException;

}
