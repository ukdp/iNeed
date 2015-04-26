/**
 * 
 */
package com.startup.ineed.exception;

/**
 * @author darshanpal
 * 
 */
public class INeedServiceException extends Exception {

	private static final long serialVersionUID = -7241081425695814514L;

	private INeedServiceError iNeedServiceError;

	public INeedServiceException() {
		super();
	}

	public INeedServiceException(INeedServiceError iNeedServiceError) {
		this.iNeedServiceError = iNeedServiceError;
	}

	/**
	 * @return the iNeedServiceError
	 */
	public INeedServiceError getiNeedServiceError() {

		if (null == iNeedServiceError
				|| null == iNeedServiceError.getErrorCode()
				|| null == iNeedServiceError.getErrorMessage()) {
			// TODO: Print Error LOG
			iNeedServiceError = INeedErrorConstants.INTERNAL_SERVER_ERROR;
		}
		return iNeedServiceError;
	}

	/**
	 * @param iNeedServiceError
	 *            the iNeedServiceError to set
	 */
	public void setiNeedServiceError(INeedServiceError iNeedServiceError) {
		this.iNeedServiceError = iNeedServiceError;
	}
}
