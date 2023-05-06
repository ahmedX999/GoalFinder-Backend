package ma.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.project.entities.Reservation;

public interface ReservationRepository  extends JpaRepository<Reservation, Integer> {

	Reservation findById(int id);
	List<Reservation> findAll();
	 List<Reservation> findByEtat(String etat);
}
