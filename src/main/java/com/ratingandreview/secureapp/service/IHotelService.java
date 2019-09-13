package com.ratingandreview.secureapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ratingandreview.secureapp.models.Hotel;

@Service
public interface IHotelService {
	
	public List<Hotel>getHotelList();
	
	public Hotel getHotelDetails(int hotelId);

}
