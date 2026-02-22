package co.mcnc.mbmcnc.service.impl;

import org.springframework.stereotype.Service;

import co.mcnc.mbmcnc.instant.NtcErrorCodeType;
import co.mcnc.mbmcnc.instant.NtcException;
import co.mcnc.mbmcnc.mapper.NotificationTemplateInfoMapper;
import co.mcnc.mbmcnc.model.NotificationTemplateInfo;
import co.mcnc.mbmcnc.service.NotificationTemplateInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationTemplateInfoServiceImpl implements NotificationTemplateInfoService {
	private final NotificationTemplateInfoMapper notificationTemplateInfoMapper;

	@Override
	public void insertNotificationTemplateInfo(NotificationTemplateInfo info) {
		notificationTemplateInfoMapper.insertNotificationTemplateInfo(info);
	}

	@Override
	public void updateNotificationTemplateInfo(NotificationTemplateInfo info) {
		try {

			NotificationTemplateInfo existing = notificationTemplateInfoMapper
					.findNotificationTemplateById(info.getMessageId());

			if (existing == null) {
				// INSERT if not exist
				int result = notificationTemplateInfoMapper.insertNotificationTemplateInfo(info);

				if (result == 0) {
					throw new NtcException(NtcErrorCodeType.INSERT_FAILED);
				}

			} else {
				// UPDATE if exist
				int result = notificationTemplateInfoMapper.updateNotificationTemplateInfo(info);

				if (result == 0) {
					throw new NtcException(NtcErrorCodeType.UPDATE_FAILED);
				}
			}
		} catch (NtcException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw new NtcException(NtcErrorCodeType.INTERNAL_ERROR);
		}
	}

}
