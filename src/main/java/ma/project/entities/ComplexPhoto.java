package ma.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class ComplexPhoto {

	
	public Long getId() {
		return id;
	}

	public ComplexPhoto() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getLogoFilename() {
		return logoFilename;
	}

	public void setLogoFilename(String logoFilename) {
		this.logoFilename = logoFilename;
	}

	public String getCoverPhotoFilename() {
		return coverPhotoFilename;
	}

	public void setCoverPhotoFilename(String coverPhotoFilename) {
		this.coverPhotoFilename = coverPhotoFilename;
	}

	public Complex getComplex() {
		return complex;
	}

	public void setComplex(Complex complex) {
		this.complex = complex;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	 private String logoFilename;
	 private String coverPhotoFilename;
	 
	 	@OneToOne
		@JoinColumn(name = "Complex_id")
		private Complex complex;
}
