package com.coursemanagesystem.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.coursemanagesystem.entities.Course;
import com.coursemanagesystem.exceptions.ResourceNotFoundException;
import com.coursemanagesystem.repositories.CourseRepo;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CourseService.class})
@ExtendWith(SpringExtension.class)
class CourseServiceTest {
    @MockBean
    private CourseRepo courseRepo;

    @Autowired
    private CourseService courseService;

    
    @Test
    void testGetAllCourses() {
        ArrayList<Course> courseList = new ArrayList<>();
        when(courseRepo.findAll()).thenReturn(courseList);
        List<Course> actualAllCourses = courseService.getAllCourses();
        assertSame(courseList, actualAllCourses);
        assertTrue(actualAllCourses.isEmpty());
        verify(courseRepo).findAll();
    }

    @Test
    void testGetCourseById() {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        Optional<Course> ofResult = Optional.of(course);
        when(courseRepo.findById((Integer) any())).thenReturn(ofResult);
        assertSame(course, courseService.getCourseById(1));
        verify(courseRepo).findById((Integer) any());
    }

    
    @Test
    void testGetCourseById2() {
        when(courseRepo.findById((Integer) any())).thenReturn(Optional.empty());
        assertThrows(ResourceNotFoundException.class, () -> courseService.getCourseById(1));
        verify(courseRepo).findById((Integer) any());
    }


    @Test
    void testSaveAllCourse() {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseRepo.save((Course) any())).thenReturn(course);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        assertSame(course, courseService.saveAllCourse(course1));
        verify(courseRepo).save((Course) any());
    }

 
    @Test
    void testDeleteById() {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        Optional<Course> ofResult = Optional.of(course);
        doNothing().when(courseRepo).delete((Course) any());
        when(courseRepo.findById((Integer) any())).thenReturn(ofResult);
        courseService.deleteById(1);
        verify(courseRepo).findById((Integer) any());
        verify(courseRepo).delete((Course) any());
    }


    @Test
    void testDeleteById3() {
        doNothing().when(courseRepo).delete((Course) any());
        when(courseRepo.findById((Integer) any())).thenReturn(Optional.empty());
        assertThrows(ResourceNotFoundException.class, () -> courseService.deleteById(1));
        verify(courseRepo).findById((Integer) any());
    }

    
    @Test
    void testUpdateCourse() {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        Optional<Course> ofResult = Optional.of(course);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        when(courseRepo.save((Course) any())).thenReturn(course1);
        when(courseRepo.findById((Integer) any())).thenReturn(ofResult);

        Course course2 = new Course();
        course2.setDescription("The characteristics of someone or something");
        course2.setDuration("Duration");
        course2.setFee(1);
        course2.setId(1);
        course2.setImage("Image");
        course2.setName("Name");
        assertSame(course1, courseService.updateCourse(course2, 1));
        verify(courseRepo, atLeast(1)).save((Course) any());
        verify(courseRepo).findById((Integer) any());
        assertEquals("Duration", course2.getDuration());
    }


    @Test
    void testUpdateCourse3() {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseRepo.save((Course) any())).thenReturn(course);
        when(courseRepo.findById((Integer) any())).thenReturn(Optional.empty());

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        assertThrows(ResourceNotFoundException.class, () -> courseService.updateCourse(course1, 1));
        verify(courseRepo).findById((Integer) any());
    }

   
    @Test
    void testGetCourses() {
        ArrayList<Course> courseList = new ArrayList<>();
        when(courseRepo.findCourseByName((String) any())).thenReturn(courseList);
        List<Course> actualCourses = courseService.getCourses("Name");
        assertSame(courseList, actualCourses);
        assertTrue(actualCourses.isEmpty());
        verify(courseRepo).findCourseByName((String) any());
    }

    
}

