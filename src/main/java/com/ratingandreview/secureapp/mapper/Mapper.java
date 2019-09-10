package com.ratingandreview.secureapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ratingandreview.secureapp.models.Hotel;

public class Mapper implements RowMapper<Hotel>{

	@Override
	public Hotel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Hotel h = new Hotel();
		h.setId(rs.getInt("id"));
		h.setHotelName(rs.getString("hotel_Name"));
		h.setHotelWebsite(rs.getString("hotel_Website"));
		h.setAddress(rs.getString("address"));
		
		return h;
	}

}
