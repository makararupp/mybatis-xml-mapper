package co.mcnc.mbmcnc.instant;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum NtcErrorCodeType {
	INSERT_FAILED("NTC_001", "Failed to insert notification template"),
	UPDATE_FAILED("NTC_002", "Failed to update notification template"),
	INTERNAL_ERROR("NTC_003", "Internal server error");

	private final String code;
	private final String message;

}
