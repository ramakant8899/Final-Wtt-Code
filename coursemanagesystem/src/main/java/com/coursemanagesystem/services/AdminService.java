package com.coursemanagesystem.services;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.management.RuntimeErrorException;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coursemanagesystem.entities.Admin;
import com.coursemanagesystem.repositories.AdminRepo;


@Service
public class AdminService 
{
	@Autowired
	AdminRepo admRepo;

	public List<Admin> getAllAdmin() 
	{
		List<Admin> allAdmin= this.admRepo.findAll();
		return allAdmin;
	}
	
//	public Admin getByEmail(String email) 
//	{
//		Admin getAdmin=this.admRepo.getByEmail(email);
//		return getAdmin;
//	}
//	
	public Admin findDetailByEmail(String email) 
	{
        Admin admin =null;
        if(Strings.isNotBlank(email) && validateEmailId(email))
        	{
        		try 
        		{
		            admin =admRepo.findByEmail(email);
		            return admin;
        		}
        		catch (Exception ex) 
		        {
		            throw new RuntimeErrorException(null, "Incorrect Email id"+ex.getMessage() );        
		        }
           }
        		else 
		        {
		           throw new RuntimeErrorException(null, "Incorrect Email id" );    
		        }
    }    
	public Boolean validateEmailId(final String email)
	{
    
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
	    Matcher matcher = pattern.matcher(email);
	    if(matcher.find()) 
	    {
	    	return true;
	    }
	    	return false;
	}
}
		

