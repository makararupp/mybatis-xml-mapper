package co.mcnc.mbmcnc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import co.mcnc.mbmcnc.model.User;

@Mapper
public interface UserMapper {
	void insert(User user);
	User findByEmail(String email);
	User getUserbyId(Long id);
	List<User> getAllUsers();
}
