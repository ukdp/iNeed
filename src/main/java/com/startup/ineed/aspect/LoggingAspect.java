/**
 * 
 */
package com.startup.ineed.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author darshanpal
 * 
 */
@Aspect
public class LoggingAspect {

	final String pointcut = "execution(* (com.startup.ineed.controller.*).*(..)) "
			+ "|| execution(* (com.startup.ineed.delegate.*).*(..))"
			+ "|| execution(* (com.startup.ineed.dao.*).*(..))";

	/** The template enter. */
	private final String TEMPLATE_ENTER = "[Entering into ";

	/** The template exit. */
	private final String TEMPLATE_EXIT = "[Exiting from ";

	/** The right bracket. */
	private final String RIGHT_BRACKET = " ]";

	@Before(pointcut)
	public void logBefore(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Logger logger = LoggerFactory.getLogger(joinPoint.getTarget()
				.getClass());
		logger.info(TEMPLATE_ENTER + methodName + RIGHT_BRACKET);
	}

	@After(pointcut)
	public void logAfter(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Logger logger = LoggerFactory.getLogger(joinPoint.getTarget()
				.getClass());
		logger.info(TEMPLATE_EXIT + methodName + RIGHT_BRACKET);
	}
}
