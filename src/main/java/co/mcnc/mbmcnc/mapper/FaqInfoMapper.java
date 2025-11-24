package co.mcnc.mbmcnc.mapper;

import org.apache.ibatis.annotations.Mapper;

import co.mcnc.mbmcnc.model.FaqInfo;

@Mapper
public interface FaqInfoMapper {
	void insertFaqInfo(FaqInfo fInfo);

}
