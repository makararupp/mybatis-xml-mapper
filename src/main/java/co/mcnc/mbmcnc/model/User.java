package co.mcnc.mbmcnc.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table
@Entity(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;
	private String gender;
	private String username;
	private String statusCode;
	//current date time
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
