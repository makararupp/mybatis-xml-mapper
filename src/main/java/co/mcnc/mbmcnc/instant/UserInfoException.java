package co.mcnc.mbmcnc.instant;

public class UserInfoException extends RuntimeException {
	private final UserInfoCodeError errorCode;

	public UserInfoException(UserInfoCodeError errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}

	public UserInfoException(UserInfoCodeError errorCode, String customMessage) {
		super(customMessage);
		this.errorCode = errorCode;
	}

	public UserInfoCodeError getErrorCode() {
		return errorCode;
	}
}
