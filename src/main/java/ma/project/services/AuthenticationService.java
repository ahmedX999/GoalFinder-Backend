package ma.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ma.project.configs.JwtService;
import ma.project.controllers.AuthenticationRequest;
import ma.project.controllers.AuthenticationResponse;
import ma.project.controllers.RegisterRequest;
import ma.project.entities.User;
import ma.project.repositories.UserRepository;



@Service
@RequiredArgsConstructor
public class AuthenticationService {
	
	
	@Autowired
	private UserRepository  repository;
		
	  @Autowired
	  private  JwtService jwtService;	  
		
	@Autowired
	private  AuthenticationManager authenticationManager;
		
		  @Autowired
		  private PasswordEncoder passwordEncoder;
	
	public AuthenticationResponse register(RegisterRequest request) {
		User user = new User();
	    user.setName(request.getFirstname());
	    user.setLastname(request.getLastname());
	    user.setEmail(request.getEmail());
	    user.setPassword(passwordEncoder.encode(request.getPassword()));
	     repository.save(user);
	    
	     String jwtToken = jwtService.generateToken(user);
	    AuthenticationResponse authenticationResponse = new AuthenticationResponse();
	    authenticationResponse.setToken(jwtToken);
	    System.out.println(jwtToken);
	    
	    return authenticationResponse;
	}
	
	
	public AuthenticationResponse authenticate(AuthenticationRequest request) {
		
		 authenticationManager.authenticate(
			        new UsernamePasswordAuthenticationToken(
			            request.getEmail(),
			            request.getPassword()
			        )
			    );
		 System.out.println("hello");
			    var user = repository.findByEmail(request.getEmail())
			        .orElseThrow();
			    String jwtToken = jwtService.generateToken(user);
			    
			    AuthenticationResponse authenticationResponse = new AuthenticationResponse();
			    authenticationResponse.setToken(jwtToken);
			    System.out.println("hello");
			    System.out.println(jwtToken);
			    System.out.println("hello");
			    return authenticationResponse;
	}

}
