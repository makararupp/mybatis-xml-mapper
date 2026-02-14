package co.mcnc.mbmcnc.service;

import java.util.List;
import java.util.Map;

import co.mcnc.mbmcnc.model.FaqInfo;

public interface FaqInfoService {
	FaqInfo register(FaqInfo faqInfo, List<Map<String, Object>> multilingualList);
}
