package com.in28minutes;



 
 public class UserValidationService  {
	 public boolean isValidateUser(String user, String password) {
	        if( user.equalsIgnoreCase("in28Minutes") && password.equals("dummy"))
	        	return true;
	        return false;
	    }
}
