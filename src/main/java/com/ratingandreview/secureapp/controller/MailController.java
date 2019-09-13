package com.ratingandreview.secureapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailController {

	 @Autowired
	    private JavaMailSender sender;

	    @RequestMapping("/sendMail")
	    public String sendMail() {
	       
	        return "msg";
	    }
}
