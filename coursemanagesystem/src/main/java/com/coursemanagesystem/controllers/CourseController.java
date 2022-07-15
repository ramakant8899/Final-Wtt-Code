package com.coursemanagesystem.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.coursemanagesystem.apiresponce.ApiResponce;
import com.coursemanagesystem.entities.Course;
import com.coursemanagesystem.services.CourseService;



@RestController
@CrossOrigin(origins = "*")
public class CourseController 
{
	@Autowired
	CourseService courseServ;
	
	@GetMapping("/course")
	public ResponseEntity<List<Course>> getAllCourses()
	{
		return ResponseEntity.ok(courseServ.getAllCourses());
	}

	@GetMapping("/course/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable("id") Integer id)
	{
		return ResponseEntity.ok(courseServ.getCourseById(id));	
	}

	@PostMapping("/course")
	public ResponseEntity<Course> saveAllCourse(@Valid @RequestBody Course course)
	{
		return new ResponseEntity<>(courseServ.saveAllCourse(course), HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Course> updateCourse(@Valid  @RequestBody Course course ,@PathVariable int id)
	{
		Course updateCourse=this.courseServ.updateCourse(course, id);
		return ResponseEntity.ok(updateCourse);
		
	}
	
	@DeleteMapping("/course/{id}")
	public ResponseEntity<ApiResponce> deleteById(@PathVariable int id)
	{	
		 this.courseServ.deleteById(id);
         return new ResponseEntity<ApiResponce>(new ApiResponce("Course Deleted Successfully", true),HttpStatus.OK);
		
	}
		
//	@GetMapping("/course1/{name}")
//	public List<Course> getCourses(@PathVariable("name") String name) 
//	{
//		return courseServ.getCourses(name);
//	}
	
	@GetMapping("/course1/{name}")
	public ResponseEntity<List<Course>> getCourses(@PathVariable("name") String name)
	{
		return ResponseEntity.ok(courseServ.getCourses(name));
	}

}
