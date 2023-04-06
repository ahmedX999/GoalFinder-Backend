package ma.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.project.entities.Role;
import ma.project.services.RoleService;

@RestController
@RequestMapping("roles")

public class RoleController {

	

	@Autowired
	private RoleService  roleServ;
	
	@PostMapping("/save")
	public void save(@RequestBody Role role) {
		roleServ.save(role);
	}
	
	@GetMapping("/all")
	public List<Role> findAll(){
		return roleServ.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) int id){
		
		roleServ.delete(id);
	}
	

	
	@GetMapping(value = "/searchById/{id}")
	public Role findById(@PathVariable (required = true) int id) {
		
		return roleServ.findById(id);
	}
	
	 @PutMapping("/update/{id}")
	 public Role updateRole( @PathVariable int id, @RequestBody Role r) {
		
		 return   roleServ.updateRole( id,  r);
		    }
		 
	
	
}
