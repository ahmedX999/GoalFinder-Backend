package ma.project.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Reservation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String etat;
    // Date de réservation
    private LocalDate reservationDate;
    
    // Heure de réservation
    private LocalTime reservationTime;
    
    public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(Long id, String etat, LocalDate reservationDate, LocalTime reservationTime, int numberOfPlayers,
			float totalPrice, Set<Field> fields, User user) {
		super();
		this.id = id;
		this.etat = etat;
		this.reservationDate = reservationDate;
		this.reservationTime = reservationTime;
		this.numberOfPlayers = numberOfPlayers;
		this.totalPrice = totalPrice;
		this.fields = fields;
		this.user = user;
	}

	// Nombre de personnes réservées
    private int numberOfPlayers;
    
    // Prix total de la réservation
    private float totalPrice;
    
    // Relation many-to-many entre Reservation et Field avec une table intermédiaire
    @ManyToMany
    @JoinTable(name = "reservation_field",
               joinColumns = @JoinColumn(name = "reservation_id"),
               inverseJoinColumns = @JoinColumn(name = "field_id"))
    private Set<Field> fields = new HashSet<>();
    
    // Relation many-to-one entre Reservation et User
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    
    //Constructeurs
   

    // Getters and setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }
    
    public LocalTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Set<Field> getFields() {
        return fields;
    }

    public void setFields(Set<Field> fields) {
        this.fields = fields;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
}
