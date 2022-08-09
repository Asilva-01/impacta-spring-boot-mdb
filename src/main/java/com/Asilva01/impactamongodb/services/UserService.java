package com.Asilva01.impactamongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Asilva01.impactamongodb.User;
import com.Asilva01.impactamongodb.repository.UserRpository;

@Service
public class UserService {
	
	@Autowired
	private  UserRpository repo;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}

}
