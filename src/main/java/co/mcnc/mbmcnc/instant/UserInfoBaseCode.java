package co.mcnc.mbmcnc.instant;

import java.time.LocalDateTime;
import lombok.Builder;

@Builder
public record UserInfoBaseCode<T>(Boolean status, Integer code, String message, LocalDateTime timeStamp, T data) {
}
