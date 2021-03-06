package de.cultuzz.techgig.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Hotel_Details",catalog="RelationalDB")
public class HotelDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="hotelDetails",fetch=FetchType.LAZY)
	private GeoCodes geoCodes;

	public HotelDetails(){
		
	}
	
	public HotelDetails(String name, GeoCodes geoCodes) {
		super();
		this.name = name;
		this.geoCodes = geoCodes;
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
	

	public GeoCodes getGeoCodes() {
		return geoCodes;
	}

	public void setGeoCodes(GeoCodes geoCodes) {
		this.geoCodes = geoCodes;
	}
		
}
