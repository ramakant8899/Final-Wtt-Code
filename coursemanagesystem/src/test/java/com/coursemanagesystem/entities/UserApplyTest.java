package com.coursemanagesystem.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class UserApplyTest {
    
    @Test
    void testConstructor() {
        UserApply actualUserApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualUserApply.setAddedDate(fromResult);
        actualUserApply.setAddress("42 Main St");
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        actualUserApply.setCourse(course);
        actualUserApply.setEmail("jane.doe@example.org");
        actualUserApply.setId(1);
        actualUserApply.setName("Name");
//        actualUserApply.setPassword("iloveyou");
        actualUserApply.setPhoneno("4105551212");
        actualUserApply.setQualification("Qualification");
        actualUserApply.toString();
        assertSame(fromResult, actualUserApply.getAddedDate());
        assertEquals("42 Main St", actualUserApply.getAddress());
        assertSame(course, actualUserApply.getCourse());
        assertEquals("jane.doe@example.org", actualUserApply.getEmail());
        assertEquals(1, actualUserApply.getId());
        assertEquals("Name", actualUserApply.getName());
//        assertEquals("iloveyou", actualUserApply.getPassword());
        assertEquals("4105551212", actualUserApply.getPhoneno());
        assertEquals("Qualification", actualUserApply.getQualification());
    }

    
    @Test
    void testConstructor2() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date addedDate = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());

        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        UserApply actualUserApply = new UserApply(1, "Name", "jane.doe@example.org", "Qualification", "4105551212",
                "42 Main St", addedDate,  course);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualUserApply.setAddedDate(fromResult);
        actualUserApply.setAddress("42 Main St");
        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        actualUserApply.setCourse(course1);
        actualUserApply.setEmail("jane.doe@example.org");
        actualUserApply.setId(1);
        actualUserApply.setName("Name");
//        actualUserApply.setPassword("iloveyou");
        actualUserApply.setPhoneno("4105551212");
        actualUserApply.setQualification("Qualification");
        actualUserApply.toString();
        assertSame(fromResult, actualUserApply.getAddedDate());
        assertEquals("42 Main St", actualUserApply.getAddress());
        assertSame(course1, actualUserApply.getCourse());
        assertEquals("jane.doe@example.org", actualUserApply.getEmail());
        assertEquals(1, actualUserApply.getId());
        assertEquals("Name", actualUserApply.getName());
//        assertEquals("iloveyou", actualUserApply.getPassword());
        assertEquals("4105551212", actualUserApply.getPhoneno());
        assertEquals("Qualification", actualUserApply.getQualification());
    }

   
    @Test
    void testConstructor3() {
        UserApply actualUserApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualUserApply.setAddedDate(fromResult);
        actualUserApply.setAddress("42 Main St");
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        actualUserApply.setCourse(course);
        actualUserApply.setEmail("jane.doe@example.org");
        actualUserApply.setId(1);
        actualUserApply.setName("Name");
//        actualUserApply.setPassword("iloveyou");
        actualUserApply.setPhoneno("4105551212");
        actualUserApply.setQualification("Qualification");
        actualUserApply.toString();
        assertSame(fromResult, actualUserApply.getAddedDate());
        assertEquals("42 Main St", actualUserApply.getAddress());
        assertSame(course, actualUserApply.getCourse());
        assertEquals("jane.doe@example.org", actualUserApply.getEmail());
        assertEquals(1, actualUserApply.getId());
        assertEquals("Name", actualUserApply.getName());
//        assertEquals("iloveyou", actualUserApply.getPassword());
        assertEquals("4105551212", actualUserApply.getPhoneno());
        assertEquals("Qualification", actualUserApply.getQualification());
    }

    
    @Test
    void testConstructor4() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date addedDate = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());

        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        UserApply actualUserApply = new UserApply(1, "Name", "jane.doe@example.org", "Qualification", "4105551212",
                "42 Main St", addedDate, course);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualUserApply.setAddedDate(fromResult);
        actualUserApply.setAddress("42 Main St");
        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        actualUserApply.setCourse(course1);
        actualUserApply.setEmail("jane.doe@example.org");
        actualUserApply.setId(1);
        actualUserApply.setName("Name");
//        actualUserApply.setPassword("iloveyou");
        actualUserApply.setPhoneno("4105551212");
        actualUserApply.setQualification("Qualification");
        actualUserApply.toString();
        assertSame(fromResult, actualUserApply.getAddedDate());
        assertEquals("42 Main St", actualUserApply.getAddress());
        assertSame(course1, actualUserApply.getCourse());
        assertEquals("jane.doe@example.org", actualUserApply.getEmail());
        assertEquals(1, actualUserApply.getId());
        assertEquals("Name", actualUserApply.getName());
//        assertEquals("iloveyou", actualUserApply.getPassword());
        assertEquals("4105551212", actualUserApply.getPhoneno());
        assertEquals("Qualification", actualUserApply.getQualification());
    }

   
    @Test
    void testConstructor5() {
        UserApply actualUserApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        actualUserApply.setAddedDate(fromResult);
        actualUserApply.setAddress("42 Main St");
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        actualUserApply.setCourse(course);
        actualUserApply.setEmail("jane.doe@example.org");
        actualUserApply.setId(1);
        actualUserApply.setName("Name");
//        actualUserApply.setPassword("iloveyou");
        actualUserApply.setPhoneno("4105551212");
        actualUserApply.setQualification("Qualification");
        actualUserApply.toString();
        assertSame(fromResult, actualUserApply.getAddedDate());
        assertEquals("42 Main St", actualUserApply.getAddress());
        assertSame(course, actualUserApply.getCourse());
        assertEquals("jane.doe@example.org", actualUserApply.getEmail());
        assertEquals(1, actualUserApply.getId());
        assertEquals("Name", actualUserApply.getName());
//        assertEquals("iloveyou", actualUserApply.getPassword());
        assertEquals("4105551212", actualUserApply.getPhoneno());
        assertEquals("Qualification", actualUserApply.getQualification());
    }

    
    @Test
    void testConstructor6() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date addedDate = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());

        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        UserApply actualUserApply = new UserApply(1, "Name", "jane.doe@example.org", "Qualification", "4105551212",
                "42 Main St", addedDate,  course);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        actualUserApply.setAddedDate(fromResult);
        actualUserApply.setAddress("42 Main St");
        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        actualUserApply.setCourse(course1);
        actualUserApply.setEmail("jane.doe@example.org");
        actualUserApply.setId(1);
        actualUserApply.setName("Name");
//        actualUserApply.setPassword("iloveyou");
        actualUserApply.setPhoneno("4105551212");
        actualUserApply.setQualification("Qualification");
        actualUserApply.toString();
        assertSame(fromResult, actualUserApply.getAddedDate());
        assertEquals("42 Main St", actualUserApply.getAddress());
        assertSame(course1, actualUserApply.getCourse());
        assertEquals("jane.doe@example.org", actualUserApply.getEmail());
        assertEquals(1, actualUserApply.getId());
        assertEquals("Name", actualUserApply.getName());
//        assertEquals("iloveyou", actualUserApply.getPassword());
        assertEquals("4105551212", actualUserApply.getPhoneno());
        assertEquals("Qualification", actualUserApply.getQualification());
    }
}

