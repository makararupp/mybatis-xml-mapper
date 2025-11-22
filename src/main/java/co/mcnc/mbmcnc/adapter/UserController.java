package co.mcnc.mbmcnc.adapter;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
	public UserInfoBaseCode<?> create(@RequestBody User user){
 		User create = userService.insert(user);
 		
 		return UserInfoBaseCode.builder()
 				.status(true)
 				.code(HttpStatus.OK.value())
 				.message("user info has been the created")
 				.timeStamp(LocalDateTime.now())
 				.data(create)
 				.build();
	}

}
