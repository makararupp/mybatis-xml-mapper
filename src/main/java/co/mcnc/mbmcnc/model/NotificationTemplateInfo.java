package co.mcnc.mbmcnc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class NotificationTemplateInfo {
	private String messageId;
	private String messageName;
	private String notificationCategoryCode;
	private String notificationIcon;
	private String statusCode;
	private String referenceServiceId;
	private String deepLinkScreenId;
}
