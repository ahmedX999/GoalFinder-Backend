package ma.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.project.dao.IDAO;
import ma.project.entities.Reservation;
import ma.project.repositories.ReservationRepository;

@Service
public class ReservationService implements IDAO<Reservation> {
	
	@Autowired
	private ReservationRepository reservationRepository ;	


	@Override
	public Reservation Save(Reservation t) {
		return reservationRepository.save(t);
	}
    
	
	 public List<Reservation> getWaitingReservations() { return
			  reservationRepository.findByEtat("waiting"); }
			
	@Override
	public void Modify(Reservation t) {
		
		reservationRepository.save(t);
		
	}
	/*
	 *   return repository.findById(id).map(
                pharmacie -> {
                    pharmacie.setNom(p.getNom());
                    pharmacie.setAdresse(p.getAdresse());
                    pharmacie.setLat(p.getLat());
                    pharmacie.setLog(p.getLog());
                    pharmacie.setZone(p.getZone());
                    return repository.save(pharmacie);
                }
        ).orElse(null);
    }
	 *
	 **/

	@Override
	public void Delete(int id) {
		
		reservationRepository.deleteById(id);
		
	}

	@Override
	public Reservation findById(int id) {
		return reservationRepository.findById(id);
	}
	
	public List<Reservation> findAll(){
		return reservationRepository.findAll();
	}
	

}
