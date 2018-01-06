package de.cultuzz.techgig.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Validity {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private Date start;
	
	@Column
	private Date end;
	
	@ManyToMany(mappedBy ="validity",fetch=FetchType.LAZY)
    private Set<Packages> packages = new HashSet<>();

	public Validity(){
		
	}
    
    public Validity(Integer id, Date start, Date end, Set<Packages> packages) {
		this.id = id;
		this.start = start;
		this.end = end;
		this.packages = packages;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Set<Packages> getPackages() {
		return packages;
	}

	public void setPackages(Set<Packages> packages) {
		this.packages = packages;
	}
    
    
	
}
