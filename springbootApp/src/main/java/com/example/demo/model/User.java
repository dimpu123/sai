package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
	
   @Column(name= "firstname")
   private String firstname;
   
   @Column(name="lastname")
   private String lastname;
   
   private String email;
   
   public User() {
	   //default constructor
   }
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User( String firstname, String lastname, String email) {
	super();
	
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
}
   
   
   
}
