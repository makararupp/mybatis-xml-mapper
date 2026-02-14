package co.mcnc.mbmcnc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.mcnc.mbmcnc.model.NotificationTemplateInfo;
import co.mcnc.mbmcnc.service.NotificationTemplateInfoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/notifications")
@RequiredArgsConstructor
public class NotificationTemplateController {
	private final NotificationTemplateInfoService notificationTemplateInfoService;

	@PostMapping
	public ResponseEntity<String> register(@RequestBody NotificationTemplateInfo request) {

		notificationTemplateInfoService.insertNotificationTemplateInfo(request);
		return ResponseEntity.ok("Register Successfully!");
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateNotification(@RequestBody NotificationTemplateInfo info) {
		try {
			notificationTemplateInfoService.updateNotificationTemplateInfo(info);
			return ResponseEntity.ok("Notification updated successfully");
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
