package ma.project.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Complex {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String name;
	private String address;
	private double laltitude;
	private double longitude;
	
	//@OneToOne(fetch = FetchType.EAGER)
	//@JoinColumn(name = "user_id")
	//@JsonIgnore
	//private User user;
	
	
	
	//List des terrains d'un complexe sportif
	@OneToMany(mappedBy = "complex", cascade = CascadeType.ALL, orphanRemoval = true)
	
    private List<Field> fields = new ArrayList<>();


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getLaltitude() {
		return laltitude;
	}


	public void setLaltitude(double laltitude) {
		this.laltitude = laltitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public Complex() {
		super();
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Field> getFields() {
		return fields;
	}


	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
}
