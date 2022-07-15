package com.coursemanagesystem.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.coursemanagesystem.entities.Admin;
import com.coursemanagesystem.services.AdminService;

@RestController
@CrossOrigin(origins = "*")
public class AdminController 
{
	@Autowired
	AdminService admServ;
	
	@GetMapping("/admin")
	public ResponseEntity<List<Admin>> getAllAdmin()
	{
	    return ResponseEntity.ok(admServ.getAllAdmin());
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<Admin> getByEmail(@Valid @RequestParam String email)
	{
		return new ResponseEntity<Admin>(admServ.findDetailByEmail(email),HttpStatus.ACCEPTED);
	}

}
