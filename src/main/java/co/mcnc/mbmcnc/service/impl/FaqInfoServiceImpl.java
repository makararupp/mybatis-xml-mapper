package co.mcnc.mbmcnc.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.mcnc.mbmcnc.mapper.FaqInfoMapper;
import co.mcnc.mbmcnc.model.FaqInfo;
import co.mcnc.mbmcnc.service.FaqInfoService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FaqInfoServiceImpl implements FaqInfoService {
	private final FaqInfoMapper faInfoMapper;
	private final ObjectMapper objectMapper;

	public String convertListToJson(List<Map<String, Object>> multilingualList) {
		try {
			return objectMapper.writeValueAsString(multilingualList);
		} catch (JsonProcessingException e) {
			throw new RuntimeException("Failed to convert multilingual list to JSON", e);
		}
	}

	private List<Map<String, Object>> convertListToJson(String json) {
		try {
			return objectMapper.readValue(json,
					objectMapper.getTypeFactory().constructCollectionType(List.class, Map.class));
		} catch (JsonProcessingException e) {
			throw new RuntimeException("Failed to convert JSON to multilingual list", e);
		}
	}

	@Override
	public FaqInfo register(FaqInfo faqInfo, List<Map<String, Object>> multilingualList) {
		String json = convertListToJson(multilingualList);
		faqInfo.setMultilingualContent(json);
		return faInfoMapper.insertFaqInfo(faqInfo);	 
	}

}
