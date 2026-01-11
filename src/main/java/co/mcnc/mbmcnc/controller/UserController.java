package co.mcnc.mbmcnc.controller;

import java.time.LocalDateTime;
import java.util.List;

import co.mcnc.mbmcnc.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.mcnc.mbmcnc.instant.UserInfoBaseCode;
import co.mcnc.mbmcnc.model.User;
import co.mcnc.mbmcnc.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<UserInfoBaseCode<User>> create(@RequestBody User user) {

		User createdUser = userService.insert(user);

		UserInfoBaseCode<User> response = UserInfoBaseCode
				.<User>builder()
				.status(true)
				.code(HttpStatus.OK.value())
				.message("User has been created successfully")
				.timeStamp(LocalDateTime.now())
				.data(createdUser).build();
		return ResponseEntity.ok(response);
	}

	@GetMapping("{id}")
	public ResponseEntity<UserInfoBaseCode<User>> getByUserId(@PathVariable("id") Long id) {

		var getUserId = userService.getUserById(id);
		UserInfoBaseCode<User> response = UserInfoBaseCode.<User>builder().status(true).code(HttpStatus.OK.value())
				.message("User Info has been found").timeStamp(LocalDateTime.now()).data(getUserId).build();

		return ResponseEntity.ok(response);

	}

	@GetMapping
	public ResponseEntity<UserInfoBaseCode<List<User>>> getAllUser() {
		List<User> list = userService.getAllUsers();
		UserInfoBaseCode<List<User>> response = UserInfoBaseCode
				.<List<User>>builder()
				.status(true)
				.code(HttpStatus.ACCEPTED.value())
				.message("users have been found!")
				.timeStamp(LocalDateTime.now())
				.data(list).build();

		return ResponseEntity.ok(response);
	}
	@PutMapping("/{id}/status")
	public ResponseEntity<String> updateStatus(
			@PathVariable Long id,
			@RequestBody UserDto request) {

		boolean updated = userService.updateStatus(id, request.getStatusCode());
		if (updated) {
			return ResponseEntity.ok("User status updated successfully");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("User not found");
		}
	}

}
