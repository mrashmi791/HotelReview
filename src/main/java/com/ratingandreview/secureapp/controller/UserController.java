package com.ratingandreview.secureapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ratingandreview.secureapp.DTO.UserDTO;
import com.ratingandreview.secureapp.models.User;
import com.ratingandreview.secureapp.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	
	@Autowired
    private JavaMailSender sender;
	
	@Autowired
	private Environment env;
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/registration")
	public String register()  {
		User user = new User();
		user.setEmail("mrashmi791@gmail.com");
		 final SimpleMailMessage email = constructEmailMessage(user);
	        sender.send(email);
		return "registration.jsp";
		
	}
	
	/**
	 * 
	 * @param userData
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value= "/save-user-details",method= RequestMethod.POST)
	private String registration(@ModelAttribute("signUpData") UserDTO userData, BindingResult result, Model model)  {
		
		User createdUser = userService.saveUser(userData);
		if(createdUser == null) {
			model.addAttribute("UserRegFailedMsg","User registration failed..!");
			return "registartion";
		} else {
			//send mail code will be here...
	        final SimpleMailMessage email = constructEmailMessage(createdUser);
	        sender.send(email);
		}
		
		return "/";
	}
	
	
	private final SimpleMailMessage constructEmailMessage(final User user) {
        final String recipientAddress = user.getEmail();
        final String subject = "Registration Confirmation";
        final String confirmationUrl = "http://localhost:8080/set-password";
        final String message = "You registered successfully. We will send you a confirmation message to your email account.";
        final SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        
        email.setText(message + " \r\n" + confirmationUrl);
        email.setFrom(env.getProperty("support.email"));
        return email;
    }
}
