package ma.project.services;

import java.util.List;

import ma.project.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import ma.project.repositories.UserRepository;

@Service
public class UserService {
	
	UserRepository userReo;
	
	
	@Autowired
	private UserRepository  userRepository;
	

	public void save(@RequestBody User user) {
		userRepository.save(user);
	}
	

	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	
	public void delete(  int id){
		User f = userRepository.findById(id);
		userRepository.delete(f);
	}
	
	
	public long countUser() {
	return userRepository.count();
	}
	
	
	public User findById(@PathVariable (required = true) int id) {
		
		return userRepository.findById(id);
	}
	
	
	 public User updateUser(int id,  User us) {
		    User user = userRepository.findById(id);
		    
		  
		    user.setUsername(us.getUsername());
		    user.setPassword(us.getPassword());
		    return userRepository.save(user);
		   
		}
	
	

}
