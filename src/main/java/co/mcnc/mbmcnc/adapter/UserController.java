package co.mcnc.mbmcnc.adapter;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

	    UserInfoBaseCode<User> response = UserInfoBaseCode.<User>builder()
	            .status(true)
	            .code(HttpStatus.OK.value())
	            .message("User has been created successfully")
	            .timeStamp(LocalDateTime.now())
	            .data(createdUser)
	            .build();

	    return ResponseEntity.ok(response);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<UserInfoBaseCode<User>> getByUserId(@PathVariable("id") Long id){
		
		var getUserId = userService.getUserById(id);
		 UserInfoBaseCode<User> response = UserInfoBaseCode.<User>builder()
				 .status(true)
				 .code(HttpStatus.OK.value())
				 .message("User Info has been found")
				 .timeStamp(LocalDateTime.now())
				 .data(getUserId)
				 .build();
				 
	   return ResponseEntity.ok(response);
				
	}


}
