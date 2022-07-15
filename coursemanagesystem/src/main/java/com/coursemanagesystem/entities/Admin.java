package com.coursemanagesystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


@Entity
public class Admin 
{
	@Id
	@Email(message="Invalid Email........")
	@Column(name="Admin_Email")
	private String email;
	
	@NotEmpty(message="Invalid Password")
	@Column(name="Admin_Password")
	private String password;

	public Admin() 
	{
		super();
	
	}

	public Admin(@Email(message = "Invalid Email........") String email,
			@NotEmpty(message = "Invalid Password") String password) 
	{
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() 
	{
		return "Admin [email=" + email + ", password=" + password + "]";
	}
}
