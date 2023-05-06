package ma.project.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
	
	private String token;
	
	public AuthenticationResponse(){}

	public void setToken(String jwtToken) {
		this.token = jwtToken;
		
	}
}
