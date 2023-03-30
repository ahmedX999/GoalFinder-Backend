package ma.project.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.project.entities.Field;



@Repository
public interface FieldRepository extends JpaRepository<Field, Integer> {

	Field findById(int id);
	
}
