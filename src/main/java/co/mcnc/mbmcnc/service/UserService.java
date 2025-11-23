package co.mcnc.mbmcnc.service;

import java.util.List;

import co.mcnc.mbmcnc.model.User;

public interface UserService {
	User insert(User user);
	User getUserByEmail(String emails);
	User getUserById(Long id);
	List<User> getAllUsers();
}
