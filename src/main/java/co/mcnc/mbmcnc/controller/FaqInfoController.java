package co.mcnc.mbmcnc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.mcnc.mbmcnc.model.FaqInfo;
import co.mcnc.mbmcnc.service.FaqInfoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/faq")
public class FaqInfoController {
	private final FaqInfoService faqInfoService;

	@Autowired
	public FaqInfoController(FaqInfoService faqInfoService) {
		this.faqInfoService = faqInfoService;
	}

	@PostMapping("/register")
	public FaqInfo registerFaq(@RequestBody Map<String, Object> requestBody) {

		FaqInfo faqInfo = new FaqInfo();

		// Set simple fields
		faqInfo.setFaqCategoryCode((String) requestBody.get("faqCategoryCode"));
		faqInfo.setAttachmentNo((String) requestBody.get("attachmentNo"));
		faqInfo.setStatusCode((String) requestBody.get("statusCode"));
		faqInfo.setCreatedBy((String) requestBody.get("createdBy"));
		faqInfo.setCreatedDepart((String) requestBody.get("createdDepart"));

		// Convert String to LocalDate and LocalTime
		//faqInfo.setCreatedDate(java.time.LocalDate.parse((String) requestBody.get("createdDate")));
		//faqInfo.setCreatedTime(java.time.LocalTime.parse((String) requestBody.get("createdTime")));

		// Extract multilingualContent as List<Map<String,Object>>
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> multilingualList = (List<Map<String, Object>>) requestBody.get("multilingualContent");

		// Call service to register
		return faqInfoService.register(faqInfo, multilingualList);
	}
}
