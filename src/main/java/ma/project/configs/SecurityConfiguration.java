package ma.project.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor 
@EnableMethodSecurity
public class SecurityConfiguration {
		@Autowired
		private  JwtAuthenticationFilter jwtAuthFilter;
		@Autowired
	  private  AuthenticationProvider authenticationProvider;
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http
        .csrf()
        .disable()
        .authorizeHttpRequests()
        .requestMatchers(
        		"/api/v1/auth/**",
        		"/complexes/**"
        		,"/fields/**"
        		,"payments/**"
        		,"/users/**"
        		,"/reservations/**"
        		,"/api/v1/auth/authenticate",
        		"/api/v1/auth/register"
        		)
        .permitAll()
        .anyRequest()
        .authenticated()
        .and()
        .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        .authenticationProvider(authenticationProvider)
        .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
        
        
        return http.build();
	}

}
