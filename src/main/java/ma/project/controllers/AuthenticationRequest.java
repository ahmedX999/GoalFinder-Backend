package ma.project.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
	
	 private String email;
	  String password;
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

}
