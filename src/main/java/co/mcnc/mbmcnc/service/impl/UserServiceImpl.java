package co.mcnc.mbmcnc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.mcnc.mbmcnc.instant.UserInfoException;
import co.mcnc.mbmcnc.instant.UserInforErrorCode;
import co.mcnc.mbmcnc.mapper.UserMapper;
import co.mcnc.mbmcnc.model.User;
import co.mcnc.mbmcnc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User insert(User user) {
		try {

//			if (userMapper.countByEmail(user.getEmail()) > 0) {
//				throw new UserInfoException(UserInforErrorCode.USER_INFO_DUPLICATE_EMAIL);
//			}
			userMapper.insert(user);
			return user;

		} catch (Exception e) {
			throw new UserInfoException(UserInforErrorCode.USER_INFO_CREATE_FAILED);
		}

	}

}
