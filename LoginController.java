package com.inautix.training.CharityProject.controller;
import com.inautix.training.CharityProject.dao.LoginDao;
import com.inautix.training.CharityProject.domain.LoginDomain;

public class LoginController {
	
	public boolean validateController(LoginDomain loginDomain){
		
		LoginDao loginDao = new LoginDao(loginDomain);
		boolean status = loginDao.authenticateUser(loginDomain);
		
                    return status;	
	
	}

}
