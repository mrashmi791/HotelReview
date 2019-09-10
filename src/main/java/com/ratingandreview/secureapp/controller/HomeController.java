package com.ratingandreview.secureapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ratingandreview.secureapp.models.Hotel;
import com.ratingandreview.secureapp.service.HotelService;



@Controller
public class HomeController {
	
	@Autowired
	private HotelService hotelService;

	@RequestMapping("/")
	public String home()  {
		
		return "index.jsp";
		
	}
	
	
	@RequestMapping("/login")
	public String loginPage()  {
		
		return "login.jsp";
		
	}
	
	@RequestMapping("/logout.sucess")
	public String logoutPage()  {
		
		return "logout.jsp";
		
	}
	
	@RequestMapping("/signup")
	public String signUp()  {
		
		return "signup.jsp";
		
	}
	
	@RequestMapping(value="/get-hotel-list", method = RequestMethod.GET)
	public ModelAndView getHotelList() {
		ModelAndView model = new ModelAndView("list.jsp");
		List<Hotel> hotels = hotelService.getHotelList();
		model.addObject("hotelList", hotels);
		return model;
	}
}
