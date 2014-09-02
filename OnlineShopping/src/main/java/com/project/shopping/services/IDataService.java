package com.project.shopping.services;

import java.util.List;

import com.project.shopping.domain.User;

public interface IDataService {  
	 public boolean authenticateUser(User user)  ; 
	  
	 public List<User> getList();  
 
	}  