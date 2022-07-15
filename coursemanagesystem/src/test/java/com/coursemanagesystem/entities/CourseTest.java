package com.coursemanagesystem.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CourseTest {
   
    @Test
    void testConstructor() {
        Course actualCourse = new Course();
        actualCourse.setDescription("The characteristics of someone or something");
        actualCourse.setDuration("Duration");
        actualCourse.setFee(1);
        actualCourse.setId(1);
        actualCourse.setImage("Image");
        actualCourse.setName("Name");
        String actualToStringResult = actualCourse.toString();
        assertEquals("The characteristics of someone or something", actualCourse.getDescription());
        assertEquals("Duration", actualCourse.getDuration());
        assertEquals(1, actualCourse.getFee());
        assertEquals(1, actualCourse.getId());
        assertEquals("Image", actualCourse.getImage());
        assertEquals("Name", actualCourse.getName());
        assertEquals("Course [id=1, name=Name, description=The characteristics of someone or something, duration=Duration,"
                + " fee=1, image=Image]", actualToStringResult);
    }

   
    @Test
    void testConstructor2() {
        Course actualCourse = new Course(1, "Name", "The characteristics of someone or something", "Duration", 1, "Image");
        actualCourse.setDescription("The characteristics of someone or something");
        actualCourse.setDuration("Duration");
        actualCourse.setFee(1);
        actualCourse.setId(1);
        actualCourse.setImage("Image");
        actualCourse.setName("Name");
        String actualToStringResult = actualCourse.toString();
        assertEquals("The characteristics of someone or something", actualCourse.getDescription());
        assertEquals("Duration", actualCourse.getDuration());
        assertEquals(1, actualCourse.getFee());
        assertEquals(1, actualCourse.getId());
        assertEquals("Image", actualCourse.getImage());
        assertEquals("Name", actualCourse.getName());
        assertEquals("Course [id=1, name=Name, description=The characteristics of someone or something, duration=Duration,"
                + " fee=1, image=Image]", actualToStringResult);
    }

    
    @Test
    void testConstructor3() {
        Course actualCourse = new Course();
        actualCourse.setDescription("The characteristics of someone or something");
        actualCourse.setDuration("Duration");
        actualCourse.setFee(1);
        actualCourse.setId(1);
        actualCourse.setImage("Image");
        actualCourse.setName("Name");
        String actualToStringResult = actualCourse.toString();
        assertEquals("The characteristics of someone or something", actualCourse.getDescription());
        assertEquals("Duration", actualCourse.getDuration());
        assertEquals(1, actualCourse.getFee());
        assertEquals(1, actualCourse.getId());
        assertEquals("Image", actualCourse.getImage());
        assertEquals("Name", actualCourse.getName());
        assertEquals("Course [id=1, name=Name, description=The characteristics of someone or something, duration=Duration,"
                + " fee=1, image=Image]", actualToStringResult);
    }

    
    @Test
    void testConstructor4() {
        Course actualCourse = new Course(1, "Name", "The characteristics of someone or something", "Duration", 1, "Image");
        actualCourse.setDescription("The characteristics of someone or something");
        actualCourse.setDuration("Duration");
        actualCourse.setFee(1);
        actualCourse.setId(1);
        actualCourse.setImage("Image");
        actualCourse.setName("Name");
        String actualToStringResult = actualCourse.toString();
        assertEquals("The characteristics of someone or something", actualCourse.getDescription());
        assertEquals("Duration", actualCourse.getDuration());
        assertEquals(1, actualCourse.getFee());
        assertEquals(1, actualCourse.getId());
        assertEquals("Image", actualCourse.getImage());
        assertEquals("Name", actualCourse.getName());
        assertEquals("Course [id=1, name=Name, description=The characteristics of someone or something, duration=Duration,"
                + " fee=1, image=Image]", actualToStringResult);
    }

    
    @Test
    void testConstructor5() {
        Course actualCourse = new Course();
        actualCourse.setDescription("The characteristics of someone or something");
        actualCourse.setDuration("Duration");
        actualCourse.setFee(1);
        actualCourse.setId(1);
        actualCourse.setImage("Image");
        actualCourse.setName("Name");
        String actualToStringResult = actualCourse.toString();
        assertEquals("The characteristics of someone or something", actualCourse.getDescription());
        assertEquals("Duration", actualCourse.getDuration());
        assertEquals(1, actualCourse.getFee());
        assertEquals(1, actualCourse.getId());
        assertEquals("Image", actualCourse.getImage());
        assertEquals("Name", actualCourse.getName());
        assertEquals("Course [id=1, name=Name, description=The characteristics of someone or something, duration=Duration,"
                + " fee=1, image=Image]", actualToStringResult);
    }

   
    @Test
    void testConstructor6() {
        Course actualCourse = new Course(1, "Name", "The characteristics of someone or something", "Duration", 1, "Image");
        actualCourse.setDescription("The characteristics of someone or something");
        actualCourse.setDuration("Duration");
        actualCourse.setFee(1);
        actualCourse.setId(1);
        actualCourse.setImage("Image");
        actualCourse.setName("Name");
        String actualToStringResult = actualCourse.toString();
        assertEquals("The characteristics of someone or something", actualCourse.getDescription());
        assertEquals("Duration", actualCourse.getDuration());
        assertEquals(1, actualCourse.getFee());
        assertEquals(1, actualCourse.getId());
        assertEquals("Image", actualCourse.getImage());
        assertEquals("Name", actualCourse.getName());
        assertEquals("Course [id=1, name=Name, description=The characteristics of someone or something, duration=Duration,"
                + " fee=1, image=Image]", actualToStringResult);
    }
}

