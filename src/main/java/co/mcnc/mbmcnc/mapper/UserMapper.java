package co.mcnc.mbmcnc.mapper;

import org.apache.ibatis.annotations.Mapper;
import co.mcnc.mbmcnc.model.User;

@Mapper
public interface UserMapper {
	int insert(User user);
	int countByEmail(String eamil);
}
