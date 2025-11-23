package co.mcnc.mbmcnc.service;

import co.mcnc.mbmcnc.model.User;

public interface UserService {
	User insert(User user);
	User getUserByEmail(String emails);
}
