package ma.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.project.entities.Complex;
import ma.project.services.ComplexService;

@RestController
@RequestMapping("/complexes")
public class ComplexController {

	@Autowired
	private ComplexService complexService;
	
	@PostMapping("/save")
	public Complex save(@RequestBody Complex complex) {
		return complexService.Save(complex);
	}
	
	@GetMapping("/all")
	public List<Complex> findAll(){
		return complexService.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) int id){
		complexService.Delete(id);
	}
}
