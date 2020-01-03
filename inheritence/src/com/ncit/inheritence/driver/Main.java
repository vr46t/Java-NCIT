package com.ncit.inheritence.driver;

import com.ncit.inheritence.model.AdminUser;
import com.ncit.inheritence.model.NormalUser;
import com.ncit.inheritence.service.UserService;

public class Main {
	
	public static void main(String[] args) {
	       UserService userService = new UserService();
     //userService.showName(new AdminUser(1,"Admin",""));
       userService.showName(new NormalUser(2,"Normal",""));
       
       
		
	
	}

}
