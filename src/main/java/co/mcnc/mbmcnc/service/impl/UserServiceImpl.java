package co.mcnc.mbmcnc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.mcnc.mbmcnc.instant.UserInfoCodeError;
import co.mcnc.mbmcnc.instant.UserInfoException;
import co.mcnc.mbmcnc.mapper.UserMapper;
import co.mcnc.mbmcnc.model.User;
import co.mcnc.mbmcnc.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User insert(User user) {
		User isExit = userMapper.findByEmail(user.getEmail());
		if(isExit !=null) {
			log.info("{}",isExit.getEmail());
			throw new UserInfoException(UserInfoCodeError.USER_INFO_DUPLICATE_EMAIL);
		}
		userMapper.insert(user);
		return user;
	}

	@Override
	public User getUserByEmail(String email) {
		return userMapper.findByEmail(email);
	}

}
