package com.coursemanagesystem.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coursemanagesystem.entities.Course;


public interface CourseRepo extends JpaRepository<Course, Integer> 
{
	List<Course> findCourseByName(String name);
	
}