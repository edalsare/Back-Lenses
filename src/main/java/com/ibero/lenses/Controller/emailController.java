package com.ibero.lenses.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibero.lenses.Model.Email;
import com.ibero.lenses.Service.emailService;

import jakarta.mail.MessagingException;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("email")
@CrossOrigin("*")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class emailController {
	
	private emailService servEmail;
	
	@PostMapping("/send")
	public  ResponseEntity<Object> email(@RequestBody Email mail) throws MessagingException {
		String names = mail.getNames();
		String email = mail.getEmail();
		String message = mail.getMessage();
		
		Email dats = new Email();
		dats.setNames(names);
		dats.setEmail(email);
		dats.setMessage(message);
		
		servEmail.sendEmail(names, email, message);
		servEmail.create(dats);
		return ResponseEntity.ok().body("emali eniviado correctamente");
	}

}
