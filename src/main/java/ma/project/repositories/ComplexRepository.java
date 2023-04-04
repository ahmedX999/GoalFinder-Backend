package ma.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.project.entities.Complex;


public interface ComplexRepository extends JpaRepository<Complex, Integer> {

	
	Complex findById(int id);
}
