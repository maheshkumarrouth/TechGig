package de.cultuzz.techgig.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Packages {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="room_id")
	private Room room;

	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name="Package_Has_Validity",catalog="RelationalDB",joinColumns={@JoinColumn(name="packageId")},inverseJoinColumns={@JoinColumn(name="validityId")})
	private Set<Validity> validity;
	
	public Packages(){
		
	}
	
	public Packages(Integer id, String name,Room room,Set<Validity> validity) {
		super();
		this.id = id;
		this.name = name;
		this.room = room;
		this.validity = validity;
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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Set<Validity> getValidity() {
		return validity;
	}

	public void setValidity(Set<Validity> validity) {
		this.validity = validity;
	}
	
}
