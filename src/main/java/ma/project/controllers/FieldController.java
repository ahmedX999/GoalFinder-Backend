package ma.project.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.project.entities.Field;
import ma.project.services.FieldService;



@RestController
@RequestMapping("/fields")
public class FieldController {
	
	@Autowired
	private FieldService fieldService;
	
	@PostMapping("/save")
	public Field save(@RequestBody Field field) {
		return fieldService.Save(field);
	}
	
	@GetMapping("/all")
	public List<Field> findAll(){
		return fieldService.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) int id){
		fieldService.Delete(id);
	}
	

	
	@GetMapping(value = "/{id}")
	public Field findById(@PathVariable (required = true) int id) {
			return fieldService.findById(id);
		}
	
	@PostMapping("/update")
	public void update(@RequestBody Field field) {
		fieldService.Modify(field);
	}
	
	@GetMapping("/{complexId}/fields")
    public List<Field> getFieldsByComplexId(@PathVariable Long complexId) {
        return fieldService.getFieldsByComplexId(complexId);
    }


	
}
