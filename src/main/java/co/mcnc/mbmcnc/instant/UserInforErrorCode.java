package co.mcnc.mbmcnc.instant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public enum UserInforErrorCode {
	USER_INFO_CREATE_FAILED("User_Service_001", "Failed to create user"),
	USER_INFO_DUPLICATE_EMAIL("User_Service_002", "Email already exists"),
	USER_INFO_NOT_FOUND("User_Service_003", "User not found")
	;
	private String code;
	private String Description;

}