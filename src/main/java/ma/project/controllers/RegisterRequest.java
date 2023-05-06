package ma.project.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegisterRequest {
	
	
	 private String firstname;
	  private String lastname;
	  private String email;
	  private String password;

	public String getFirstname() {
		
		return firstname;
	}

	public String getLastname() {
		// TODO Auto-generated method stub
		return lastname;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public CharSequence getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	  
	  
	

} 
