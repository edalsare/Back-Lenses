package com.ibero.lenses.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibero.lenses.Model.User;
import com.ibero.lenses.Service.userService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("register")
@CrossOrigin("*")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class userController {
	
	userService userServ;
	
	@PostMapping("/save")
	public  ResponseEntity<Object> user(@RequestBody User user){
		
		userServ.create(user);
		return ResponseEntity.ok().body("usuario registrado satisfactoriamente");
		
	}

}
