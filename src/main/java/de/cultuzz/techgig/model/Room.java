package de.cultuzz.techgig.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Room {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="room",fetch=FetchType.LAZY)
	private Set<Packages> packages;

	
	public Room() {
		
	}
	
	public Room(Integer id, String name, Set<Packages> packages) {
		super();
		this.id = id;
		this.name = name;
		this.packages = packages;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Packages> getPackages() {
		return packages;
	}

	public void setPackages(Set<Packages> packages) {
		this.packages = packages;
	}
	
}
