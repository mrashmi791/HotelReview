package com.ratingandreview.secureapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingandreview.secureapp.models.Hotel;
import com.ratingandreview.secureapp.repository.HotelRepository;

@Service
public class HotelService implements IHotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public List<Hotel> getHotelList() {
		return hotelRepository.getHotelList();
	}

	@Override
	public Hotel getHotelDetails(int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
