package co.mcnc.mbmcnc.mapper;

import org.apache.ibatis.annotations.Mapper;
import co.mcnc.mbmcnc.model.User;

@Mapper
public interface UserMapper {
	void insert(User user);
}
