package co.mcnc.mbmcnc.mapper;

import org.apache.ibatis.annotations.Mapper;

import co.mcnc.mbmcnc.model.NotificationTemplateInfo;

@Mapper
public interface NotificationTemplateInfoMapper {
	int insertNotificationTemplateInfo(NotificationTemplateInfo notificationTemplateInfo);

}
