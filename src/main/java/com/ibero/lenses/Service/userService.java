package com.ibero.lenses.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibero.lenses.Model.User;
import com.ibero.lenses.Repository.userRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor=@__(@Autowired))
public class userService {
	
	userRepository userrepository;
	
	public User create(User newClient) {
		return userrepository.save(newClient);		
	}

}
