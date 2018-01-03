package de.cultuzz.techgig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="Geo_Codes",catalog="RelationalDB")
public class GeoCodes {
	
	@Id
	@GenericGenerator(name="generator",strategy="foreign",parameters=@Parameter(name="property",value="hotelDetails"))
	@GeneratedValue(generator="generator")
	@Column
	private Integer hotel_id;
	
	@Column
	private Integer langitude;
	
	@Column
	private Integer latitude;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private HotelDetails hotelDetails;
	
	public GeoCodes(Integer hotel_id,Integer langitude,Integer latitude,HotelDetails hotelDetails){
		this.hotel_id = hotel_id;
		this.langitude = langitude;
		this.latitude = latitude;
		this.hotelDetails = hotelDetails;
	}
	
	public GeoCodes(){
		
	}
	
	public Integer getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(Integer hotel_id) {
		this.hotel_id = hotel_id;
	}
	public Integer getLangitude() {
		return langitude;
	}
	public void setLangitude(Integer langitude) {
		this.langitude = langitude;
	}
	public Integer getLatitude() {
		return latitude;
	}
	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	public HotelDetails getHotelDetails() {
		return hotelDetails;
	}

	public void setHotelDetails(HotelDetails hotelDetails) {
		this.hotelDetails = hotelDetails;
	}
	
	

}
