package com.ratingandreview.secureapp.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hotel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="hotel_name")
	private String hotelName;
	
	@Column(name="hotel_website")
	private String hotelWebsite;
	
	@Column(name="address")
	private String address;
	
	 @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
	 private Set<RatingAndReview> ratingAndReview;
	
	private boolean enabled;
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", hotelName=" + hotelName + ", hotelWebsite=" + hotelWebsite + ", address="
				+ address + ", enabled=" + enabled + "]";
	}

	public Set<RatingAndReview> getRatingAndReview() {
		return ratingAndReview;
	}
	
	public void setRatingAndReview(Set<RatingAndReview> ratingAndReview) {
		this.ratingAndReview = ratingAndReview;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelWebsite() {
		return hotelWebsite;
	}
	public void setHotelWebsite(String hotelWebsite) {
		this.hotelWebsite = hotelWebsite;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	
	
	

}
