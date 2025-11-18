package co.mcnc.mbmcnc.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {
	private Long id;
	private String username;
	private String email;
	private String gender;
	private LocalDateTime creatAt;

}
