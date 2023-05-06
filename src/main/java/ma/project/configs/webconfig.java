package ma.project.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.http.MediaType;



@Configuration
public class webconfig implements WebMvcConfigurer {

	
	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	            .allowedOrigins("*")
	            .allowedMethods("GET", "POST", "PUT", "DELETE")
	            .allowCredentials(false)
	            .maxAge(3600);
	    }
	 
	  @Override
	    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
	        configurer.defaultContentType(MediaType.APPLICATION_JSON);
	        // Other configuration options
	    }
}
