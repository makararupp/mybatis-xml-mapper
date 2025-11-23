package co.mcnc.mbmcnc.instant;

import lombok.Getter;

@Getter
public class UserInfoException extends RuntimeException {
	private final UserInfoCodeError errorCode;

	public UserInfoException(UserInfoCodeError errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}

}
