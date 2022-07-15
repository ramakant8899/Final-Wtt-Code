package com.coursemanagesystem.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AdminTest {
    
    @Test
    void testConstructor() {
        Admin actualAdmin = new Admin();
        actualAdmin.setEmail("jane.doe@example.org");
        actualAdmin.setPassword("iloveyou");
        String actualToStringResult = actualAdmin.toString();
        assertEquals("jane.doe@example.org", actualAdmin.getEmail());
        assertEquals("iloveyou", actualAdmin.getPassword());
        assertEquals("Admin [email=jane.doe@example.org, password=iloveyou]", actualToStringResult);
    }

    
    @Test
    void testConstructor2() {
        Admin actualAdmin = new Admin("jane.doe@example.org", "iloveyou");
        actualAdmin.setEmail("jane.doe@example.org");
        actualAdmin.setPassword("iloveyou");
        String actualToStringResult = actualAdmin.toString();
        assertEquals("jane.doe@example.org", actualAdmin.getEmail());
        assertEquals("iloveyou", actualAdmin.getPassword());
        assertEquals("Admin [email=jane.doe@example.org, password=iloveyou]", actualToStringResult);
    }

   
    @Test
    void testConstructor3() {
        Admin actualAdmin = new Admin();
        actualAdmin.setEmail("jane.doe@example.org");
        actualAdmin.setPassword("iloveyou");
        String actualToStringResult = actualAdmin.toString();
        assertEquals("jane.doe@example.org", actualAdmin.getEmail());
        assertEquals("iloveyou", actualAdmin.getPassword());
        assertEquals("Admin [email=jane.doe@example.org, password=iloveyou]", actualToStringResult);
    }

   
    @Test
    void testConstructor4() {
        Admin actualAdmin = new Admin("jane.doe@example.org", "iloveyou");
        actualAdmin.setEmail("jane.doe@example.org");
        actualAdmin.setPassword("iloveyou");
        String actualToStringResult = actualAdmin.toString();
        assertEquals("jane.doe@example.org", actualAdmin.getEmail());
        assertEquals("iloveyou", actualAdmin.getPassword());
        assertEquals("Admin [email=jane.doe@example.org, password=iloveyou]", actualToStringResult);
    }

   
    @Test
    void testConstructor5() {
        Admin actualAdmin = new Admin();
        actualAdmin.setEmail("jane.doe@example.org");
        actualAdmin.setPassword("iloveyou");
        String actualToStringResult = actualAdmin.toString();
        assertEquals("jane.doe@example.org", actualAdmin.getEmail());
        assertEquals("iloveyou", actualAdmin.getPassword());
        assertEquals("Admin [email=jane.doe@example.org, password=iloveyou]", actualToStringResult);
    }

    
    @Test
    void testConstructor6() {
        Admin actualAdmin = new Admin("jane.doe@example.org", "iloveyou");
        actualAdmin.setEmail("jane.doe@example.org");
        actualAdmin.setPassword("iloveyou");
        String actualToStringResult = actualAdmin.toString();
        assertEquals("jane.doe@example.org", actualAdmin.getEmail());
        assertEquals("iloveyou", actualAdmin.getPassword());
        assertEquals("Admin [email=jane.doe@example.org, password=iloveyou]", actualToStringResult);
    }
}

