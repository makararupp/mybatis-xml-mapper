package co.mcnc.mbmcnc.instant;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserInfoException.class)
	public ResponseEntity<Map<String, Object>> handleUserInfoException(UserInfoException e) {
		Map<String, Object> response = new HashMap<>();
		response.put("status", false);
		response.put("error", e.getErrorCode().getCode());
		response.put("message", e.getErrorCode().getMessage());
		response.put("timestam", LocalDateTime.now());
		
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
	}

}
