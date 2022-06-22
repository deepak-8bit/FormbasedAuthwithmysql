package com.simplevaliation.validationprogram.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class User {
	@Id
	 @NotNull
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	
	 private String username;
	 private String password;
	 
	 @ManyToMany(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	 
	 @JoinTable(name = "users_roles", 
	 joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), 
	 inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
			 
	 private Collection<Role> role;


		
	

}
