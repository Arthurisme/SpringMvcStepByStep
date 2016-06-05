package com.in28minutes.login;

import javax.enterprise.inject.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.login.LoginService;

@Controller
//@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	private LoginService loginService ;
//	String returnedPageName;

	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String showLoginPage(ModelMap model) {
		 model.put("name", "in28Minutes");
	        return "welcome";
	    }
	 
	 
//	 @RequestMapping(value = "/login", method = RequestMethod.POST)
//	    public String handleLoginRequest(ModelMap model ,@RequestParam String name, @RequestParam String password) {
//		    model.put("name", name);
//		    model.put("password", password);
//		    
//			boolean isValidUser = service.validateUser(name, password);
//
//			if (isValidUser) {
//				returnedPageName =  "welcome";
//			} else {
//				
//			    model.put("errorMessage", "Invalid Credentials!!");
//
// 
//				returnedPageName =  "login";
//
//			}
//		    
// 	        return returnedPageName;
//	    }

}
