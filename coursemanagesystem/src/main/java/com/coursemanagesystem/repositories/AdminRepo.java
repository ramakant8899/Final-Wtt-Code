package com.coursemanagesystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursemanagesystem.entities.Admin;



public interface AdminRepo extends JpaRepository<Admin, String>  
{

	Admin findByEmail(String email);
	
}
