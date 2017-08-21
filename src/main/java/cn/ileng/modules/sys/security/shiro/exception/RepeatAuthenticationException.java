package cn.ileng.modules.sys.security.shiro.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * 重复认证异常
 *
 * @author ileng
 *
 */
@SuppressWarnings("serial")
public class RepeatAuthenticationException extends AuthenticationException {

	public RepeatAuthenticationException() {
		super();
	}

	public RepeatAuthenticationException(String message) {
		super(message);
	}

	public RepeatAuthenticationException(Throwable cause) {
		super(cause);
	}

	public RepeatAuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}
}
