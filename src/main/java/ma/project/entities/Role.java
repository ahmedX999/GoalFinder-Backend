package ma.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	     
	    @Column(nullable = false, length = 30)
	    private String name;
	 
	   
	 
	    public Role() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Role(Integer id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public Role(Integer id) {
	        this.id = id;
	    }

	    @Override
	    public String toString() {
	        return this.name;
	    }
	    public String getName() {
	       return this.name;
	    }
	    
	    public void setName(String n) {
		       this.name=n;
		    }
	    public int getId() {
		       return this.id;
		    }
		    
		    public void setId(int id) {
			       this.id=id;
			    }
	}



