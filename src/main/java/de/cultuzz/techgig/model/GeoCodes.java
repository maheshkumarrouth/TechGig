package de.cultuzz.techgig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Geo_Codes",catalog="RelationalDB")
public class GeoCodes {
	
	@Id
	private Integer hotel_id;
	
	@Column
	private Integer langitude;
	
	@Column
	private Integer latitude;
	
	
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

}
