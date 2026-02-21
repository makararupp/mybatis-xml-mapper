package co.mcnc.mbmcnc.instant;

import lombok.Getter;

@Getter
public class NtcException extends RuntimeException {
	private final NtcErrorCodeType errorCode;

	public NtcException(NtcErrorCodeType errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}

	public NtcErrorCodeType getErrorCode() {
		return errorCode;
	}
}
