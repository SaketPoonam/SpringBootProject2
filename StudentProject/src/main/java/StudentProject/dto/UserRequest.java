package StudentProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserRequest {
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	private String name;
	private String email;
	private int mobile;
	private String gender;
	private int age;
	private String address;
	private int pincode;
	private String nationality;

}
