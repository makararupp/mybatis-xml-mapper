package co.mcnc.mbmcnc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import co.mcnc.mbmcnc.model.NotificationTemplateInfo;

@Mapper
public interface NotificationTemplateInfoMapper {
	int insertNotificationTemplateInfo(NotificationTemplateInfo notificationTemplateInfo);

	int updateNotificationTemplateInfo(NotificationTemplateInfo notificationTemplateInfo);

	NotificationTemplateInfo findNotificationTemplateById(@Param("messageId") String messageId);
}
