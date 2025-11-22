package co.mcnc.mbmcnc.instant;


public class UserInfoException extends RuntimeException{
	 private final UserInforErrorCode errorCode;

	    public UserInfoException(UserInforErrorCode errorCode) {
	        super(errorCode.getDescription()); // optional, sets exception message
	        this.errorCode = errorCode;
	    }

	    public UserInforErrorCode getErrorCode() {
	        return errorCode;
	    }

}
