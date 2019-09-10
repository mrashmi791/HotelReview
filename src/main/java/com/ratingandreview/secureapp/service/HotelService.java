package com.ratingandreview.secureapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingandreview.secureapp.models.Hotel;
import com.ratingandreview.secureapp.repository.HotelRepository;

@Service
public class HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	public List<Hotel> getHotelList() {
		return hotelRepository.getHotelList();
	}
}
