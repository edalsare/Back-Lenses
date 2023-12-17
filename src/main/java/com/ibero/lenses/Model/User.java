package com.ibero.lenses.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "client_id")
	private Integer clientId;
	
	@Column(name="names")
	private String names;	

	
	@Column(name="last_names")
	private String last_names;
	
	private String telephone;
	
	private String email;
	
	private String password;
	
	@Column(name="users")
	private String users;
}
