package com.ratingandreview.secureapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ratingandreview.secureapp.mapper.Mapper;
import com.ratingandreview.secureapp.models.Hotel;

@Repository
public class HotelRepository  {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	 public List<Hotel> getHotelList() {
	    List<Hotel> hotelList = new ArrayList<Hotel>();
		
		hotelList = jdbcTemplate.query("select * from hotel", new Mapper());
		System.out.println(hotelList.toString());
		return hotelList;
	}
	 
	

}
