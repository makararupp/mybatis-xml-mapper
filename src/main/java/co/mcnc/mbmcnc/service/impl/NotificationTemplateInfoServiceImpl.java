package co.mcnc.mbmcnc.service.impl;

import org.springframework.stereotype.Service;

import co.mcnc.mbmcnc.mapper.NotificationTemplateInfoMapper;
import co.mcnc.mbmcnc.model.NotificationTemplateInfo;
import co.mcnc.mbmcnc.service.NotificationTemplateInfoService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotificationTemplateInfoServiceImpl implements NotificationTemplateInfoService {
	private final NotificationTemplateInfoMapper notificationTemplateInfoMapper;

	@Override
	public void insertNotificationTemplateInfo(NotificationTemplateInfo info) {
		notificationTemplateInfoMapper.insertNotificationTemplateInfo(info);
	}

	@Override
	public void updateNotificationTemplateInfo(NotificationTemplateInfo info) {
		NotificationTemplateInfo existing = notificationTemplateInfoMapper
				.findNotificationTemplateById(info.getMessageId());
		if (existing == null) {
			// Insert if not found
			notificationTemplateInfoMapper.updateNotificationTemplateInfo(info);
		} else {
			// Update if exists
			notificationTemplateInfoMapper.insertNotificationTemplateInfo(info);
		}

	}

}
