package ma.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.project.entities.Role;
import ma.project.repositories.RoleRepository;
@Service
public class RoleService {

	

	@Autowired
	private RoleRepository  roleRepo;
	

	public void save(Role role) {
		roleRepo.save(role);
	}
	
	
	public List<Role> findAll(){
		return roleRepo.findAll();
	}
	
	
	public void delete(  int id){
		Role f = roleRepo.findById( id);
		roleRepo.delete(f);
	}
	

	

	public Role findById(int id) {
		
		return roleRepo.findById(id);
	}
	
	
	 public Role updateRole(int id, Role r) {
		 Role role = roleRepo.findById(id);
		    if(role != null) {
		    role.setName(r.getName());
		 
		    roleRepo.save(role);
		    }
		    return null;
		}
}
