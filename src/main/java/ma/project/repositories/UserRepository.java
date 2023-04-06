package ma.project.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import ma.project.entities.User;

public interface UserRepository   extends JpaRepository<User,Integer>{

	
	List<User> findUserById(int id);
	User findById(int id);
	
}
