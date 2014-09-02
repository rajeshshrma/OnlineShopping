package com.project.shopping.dao;

import java.util.List;

import com.project.shopping.domain.User;

public interface IDataDao {  
	 public boolean authenticateUser(User user)  ; 
	  
	 public List<User> getList();  
 
	}  