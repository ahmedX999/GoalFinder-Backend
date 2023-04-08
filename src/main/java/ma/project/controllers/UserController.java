package ma.project.controllers;

import java.util.List;

import ma.project.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.project.services.UserService;


@RestController
@RequestMapping("users")
public class UserController {

	
	@Autowired
	private UserService  userServ;
	
	@PostMapping("/save")
	public void save(@RequestBody User user) {
		userServ.save(user);
	}
	
	@GetMapping("/all")
	public List<User> findAll(){
		return userServ.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) int id){
	
		userServ.delete( id);
	}
	
	@GetMapping(value = "/count")
	public long countFields() {
	return userServ.countUser();
	}
	
	@GetMapping(value = "/searchById/{id}")
	public User findById(@PathVariable (required = true) int id) {
		
		return userServ.findById(id);
	}
	
	 @PutMapping("/update/{id}")
	 public User updateUser(@PathVariable int id, @RequestBody User us) {
		 
		    return userServ.updateUser(id, us);
		}
	
	
	
}
