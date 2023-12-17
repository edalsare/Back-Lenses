package com.ibero.lenses.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Email")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int idemail;
	private String names;
	private String email;
	private String message;
	
	public Email(String names, String email, String message) {
		this.names = names;
		this.email = email;
		this.message = message;
	}

}
