package com.Asilva01.impactamongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Asilva01.impactamongodb.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> finAll(){
		User Geraldo = new User ("1", "Geraldo Souza", "geraldo@gmail.com" );
		User Raimundo = new User ("1", "Raimundo da Silva", "raminundo@gmail.com" );
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(Geraldo, Raimundo));
		return ResponseEntity.ok().body(list);
	}
	
}
