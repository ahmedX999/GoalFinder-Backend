package ma.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.project.dao.IDAO;
import ma.project.entities.Complex;
import ma.project.repositories.ComplexRepository;

@Service

public class ComplexService implements IDAO<Complex> {

	@Autowired
	private ComplexRepository complexRepository ;	

	
	@Override
	public Complex Save(Complex t) {
		
		return complexRepository.save(t);
	}

	@Override
	public void Modify(Complex t) {
		complexRepository.save(t);
		
	}

	@Override
	public void Delete(int id) {
		complexRepository.deleteById(id);
		
	}

	@Override
	public Complex findById(int id) {
		
		return complexRepository.findById(id);
	}
	
	public List<Complex> findAll(){
		return complexRepository.findAll();
	}

}
