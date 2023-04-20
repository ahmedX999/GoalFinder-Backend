package ma.project.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.project.dao.IDAO;
import ma.project.entities.Complex;
import ma.project.entities.Field;
import ma.project.repositories.ComplexRepository;
import ma.project.repositories.FieldRepository;

@Service
public class FieldService implements IDAO<Field>{
	
	@Autowired
	private FieldRepository fieldRepository;
	
	@Autowired
	private ComplexRepository complexRepository;

	@Override
	public Field Save(Field t) {
		// TODO Auto-generated method stub
		return fieldRepository.save(t);
	}

	@Override
	public void Modify(Field t) {
		fieldRepository.save(t);
		
	}

	@Override
	public void Delete(int id) {
		fieldRepository.deleteById(id);
		
	}

	@Override
	public Field findById(int id) {
		// TODO Auto-generated method stub
		return fieldRepository.findById(id);
	}
	
	public List<Field> findAll(){
		return fieldRepository.findAll();
	}
	
	public List<Field> getFieldsByComplexId(Long complexId) {
        Complex complex = new Complex();
        complex.setId(complexId);
        return fieldRepository.findByComplex(complex);
        
    }
	public List<Field> getFieldsByComplexId2(int complexId) {
		Complex complex = complexRepository.findById(complexId);
        return complex.getFields();
       
        
    }
	
	
	
}
