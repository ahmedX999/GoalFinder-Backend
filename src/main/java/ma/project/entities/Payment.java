package ma.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	private String etat;
	 	private String paymentMethod;
	 	private double amount;
	 
	 	 @ManyToOne
		    @JoinColumn(name = "user_id")
		    private User user;
	    
	 
	 @ManyToOne
	    @JoinColumn(name = "field_id")
	    private Field field;
	 
	 @ManyToOne
	    @JoinColumn(name = "reservation_id")
	    private Reservation reservation;
	 
	 @ManyToOne
	    @JoinColumn(name = "complex_id")
	    private Complex complex;



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Field getField() {
		return field;
	}


	public void setField(Field field) {
		this.field = field;
	}




	public Payment() {
		super();
	}
	 
	 

	    

}
