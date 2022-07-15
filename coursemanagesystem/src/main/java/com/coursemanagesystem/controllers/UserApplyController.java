package com.coursemanagesystem.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.coursemanagesystem.entities.UserApply;
import com.coursemanagesystem.services.UserApplyService;

@RestController
@CrossOrigin(origins = "*")
public class UserApplyController 
{
	@Autowired
	UserApplyService useappServ;
	
	@GetMapping("/user")
	public ResponseEntity<Object> getAllUser()
	{
	 return ResponseEntity.ok(useappServ.getAllUser());
	}
	
	@PostMapping("/user")
	public ResponseEntity<UserApply> saveAllUser(@Valid @RequestBody UserApply apply) throws Exception
	{
		return new ResponseEntity<UserApply>(useappServ.saveAllUser(apply),HttpStatus.OK);
	}
	
	@PostMapping("/userlogin")
	public ResponseEntity<UserApply> getByEmail(@Valid @RequestParam String email)
	{
	   return new ResponseEntity<UserApply>(useappServ.getByEmail(email),HttpStatus.ACCEPTED);
	}

	
}
