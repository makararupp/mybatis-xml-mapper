package co.mcnc.mbmcnc.instant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserInfoCodeError {
	    USER_INFO_DUPLICATE_EMAIL("001_DUPLICATE_EMAIL", "Email already exists"),
	    USER_INFO_MULTIPLE_RECORDS_FOUND("002_MULTIPLE_RECORDS", "Multiple records found for the same email"),
	    USER_INFO_DATA_CORRUPTION("003_DATA_CORRUPTION", "Database integrity issue detected"),
	    USER_INFO_NOT_FOUND("004_USER_NOT_FOUND", "User id not found"),
	    USER_INFO_EMAIL_REQUIRED("005_EMAIL_REQUIRED", "Email is required");
	    
	    private final String code;
	    private final String message;

}
