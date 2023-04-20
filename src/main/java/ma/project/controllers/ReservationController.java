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

import ma.project.entities.Reservation;
import ma.project.services.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@PostMapping("/save")
	public Reservation save(@RequestBody Reservation reservation) {
		return reservationService.Save(reservation);
	}
	
	@GetMapping("/all")
	public List<Reservation> findAll(){
		return reservationService.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable (required = true) int id){
		reservationService.Delete(id);
	}
	
	@GetMapping(value = "/{id}")
	public Reservation findById(@PathVariable (required = true) int id) {
			return reservationService.findById(id);
		}
	
	@PostMapping("/update")
	public void update(@RequestBody Reservation reservation) {
		reservationService.Modify(reservation);
	}
	

	  @GetMapping("/waiting") public List<Reservation> allwaiting(){
		  return  reservationService.getWaitingReservations();
	  }
	 
	

}
