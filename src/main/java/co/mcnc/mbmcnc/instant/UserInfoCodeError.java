package co.mcnc.mbmcnc.instant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserInfoCodeError {
	    USER_INFO_DUPLICATE_EMAIL("DUPLICATE_EMAIL", "Email already exists"),
	    USER_INFO_MULTIPLE_RECORDS_FOUND("MULTIPLE_RECORDS", "Multiple records found for the same email"),
	    USER_INFO_DATA_CORRUPTION("DATA_CORRUPTION", "Database integrity issue detected"),
	    USER_INFO_EMAIL_REQUIRED("EMAIL_REQUIRED", "Email is required");
	    
	    private final String code;
	    private final String message;

}
