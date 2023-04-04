package ma.project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Field {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
    //nom du terrain
	private String name;
	
	//reserve ou non reserve  ou pas valable pour le moment
	private int state;
	
	//capacite de joueur soit 5 par equipe  soit 7 par equipe
	private int capacity;
	
	//prix de reservation pour chaque personne
	private int price_perslot;
	
	//Chaque Terrain apartient a un et un seule complexe sportif
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
    private Complex complex;
	
	public Complex getComplex() {
		return complex;
	}

	public void setComplex(Complex complex) {
		this.complex = complex;
	}
	
	
	public Field() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getPrice_perslot() {
		return price_perslot;
	}
	public void setPrice_perslot(int price_perslot) {
		this.price_perslot = price_perslot;
	}
	
	
	

	

	
	


}
