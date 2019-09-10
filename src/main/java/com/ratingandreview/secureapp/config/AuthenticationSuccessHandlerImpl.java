package com.ratingandreview.secureapp.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.ratingandreview.secureapp.models.CustomUserDetails;
import com.ratingandreview.secureapp.models.TempUserDetailsDTO;

@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

	@Autowired
	HttpSession session;
	
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest arg0, HttpServletResponse arg1, Authentication authentication)
			throws IOException, ServletException {
		
		TempUserDetailsDTO  tempUser = new TempUserDetailsDTO();
		
		System.out.println(authentication.getName());
		String userName = authentication.getName();
		tempUser.setUserName(userName);
		CustomUserDetails userDetails = ((CustomUserDetails) authentication.getPrincipal());
		tempUser.setUserId(userDetails.getUser().getId());
		tempUser.setUserRole(userDetails.getUser().getRole());
		
		session.setAttribute("user", tempUser);
		session.setAttribute("userRole", tempUser.getUserRole());
		session.setAttribute("userName", tempUser.getUserName());
		redirectStrategy.sendRedirect(arg0, arg1, "/");
	}

}
