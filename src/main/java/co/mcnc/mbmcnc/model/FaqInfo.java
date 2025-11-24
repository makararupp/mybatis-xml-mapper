package co.mcnc.mbmcnc.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FaqInfo {
	 private Long faqId;
	    private String faqCategoryCode;
	    private String multilingualContent; // JSON as string
	    private String attachmentNo;
	    private String statusCode;
	    private LocalDateTime systemTimestamp;
	    private String createdDepart;
	    private String createdBy;
	    private String createdDate;
	    private String createdTime;
	    private String updatedDepart;
	    private String updatedBy;
	    private String updatedDate;
	    private String updatedTime;

}
