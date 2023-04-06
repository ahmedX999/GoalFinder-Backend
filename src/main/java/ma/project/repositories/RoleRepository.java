package ma.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.project.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{


List<Role> findAll();

	
Role findById(int id);
}
