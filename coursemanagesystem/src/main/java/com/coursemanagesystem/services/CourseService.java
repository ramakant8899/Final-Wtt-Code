package com.coursemanagesystem.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coursemanagesystem.entities.Course;
import com.coursemanagesystem.exceptions.ResourceNotFoundException;
import com.coursemanagesystem.repositories.CourseRepo;

@Service
public class CourseService 
{
	@Autowired
	CourseRepo courseRepo;

	public List<Course> getAllCourses() 
	{
	    List<Course> alluser = this.courseRepo.findAll();
		return alluser;
	}
	
	public Course getCourseById(int id) 
	{
		Course course=null;
		try 
		{
		 course= this.courseRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Course", "Id", id));
		 return course;
		}
		catch (Exception e) 
		{
			throw  new ResourceNotFoundException("Course", "Id", id);
		}
	}

//	public Course getCourseById(int id) 
//	{
//	  Course course= this.courseRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Course", "Id", id));
//      return course;
//	}
	
	
	public Course saveAllCourse(Course course) 
	{
		Course saveAll = this.courseRepo.save(course);
		return saveAll;
	}

	public void deleteById(int id)
	{
		Course deleteCourse = this.courseRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Course", "Id", id));
		this.courseRepo.delete(deleteCourse);
	}

	public Course updateCourse(Course course, int id) 
	{
		Course courses = this.courseRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Course", "Id", id));
		courses.setFee(course.getFee());
		courses.setDescription(course.getDescription());
		course.setDuration(course.getDuration());
		courses.setName(course.getName());
		courses.setImage(course.getImage());
		Course updateCourse = this.saveAllCourse(courses);
		return this.courseRepo.save(updateCourse);
	}


	public List<Course> getCourses(String name) 
	{
		return courseRepo.findCourseByName(name);
	}
	
}

