package com.ncit.inheritence.service;

import com.ncit.inheritence.model.AdminUser;
import com.ncit.inheritence.model.NormalUser;
import com.ncit.inheritence.model.User;



public class UserService {
   
	 public void showName(User user) {
		 
		 
		 if(user instanceof AdminUser) {
			 System.out.println("Admin Refl");
		 }
		 
		 else if(user instanceof NormalUser) {
			 System.out.println("Normal Refl");
			 
		 }
	    System.out.println(user.getName());
	 }
}
