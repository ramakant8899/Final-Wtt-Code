package com.coursemanagesystem.apiresponce;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ApiResponceTest {
   
    @Test
    void testConstructor() {
        ApiResponce actualApiResponce = new ApiResponce();
        actualApiResponce.setMessage("Not all who wander are lost");
        actualApiResponce.setSuccess(true);
        assertEquals("Not all who wander are lost", actualApiResponce.getMessage());
        assertTrue(actualApiResponce.isSuccess());
    }

    
    @Test
    void testConstructor2() {
        ApiResponce actualApiResponce = new ApiResponce("Not all who wander are lost", true);
        actualApiResponce.setMessage("Not all who wander are lost");
        actualApiResponce.setSuccess(true);
        assertEquals("Not all who wander are lost", actualApiResponce.getMessage());
        assertTrue(actualApiResponce.isSuccess());
    }

   
    @Test
    void testConstructor3() {
        ApiResponce actualApiResponce = new ApiResponce();
        actualApiResponce.setMessage("Not all who wander are lost");
        actualApiResponce.setSuccess(true);
        assertEquals("Not all who wander are lost", actualApiResponce.getMessage());
        assertTrue(actualApiResponce.isSuccess());
    }

    
    @Test
    void testConstructor4() {
        ApiResponce actualApiResponce = new ApiResponce("Not all who wander are lost", true);
        actualApiResponce.setMessage("Not all who wander are lost");
        actualApiResponce.setSuccess(true);
        assertEquals("Not all who wander are lost", actualApiResponce.getMessage());
        assertTrue(actualApiResponce.isSuccess());
    }

    
    @Test
    void testConstructor5() {
        ApiResponce actualApiResponce = new ApiResponce();
        actualApiResponce.setMessage("Not all who wander are lost");
        actualApiResponce.setSuccess(true);
        assertEquals("Not all who wander are lost", actualApiResponce.getMessage());
        assertTrue(actualApiResponce.isSuccess());
    }

    
    @Test
    void testConstructor6() {
        ApiResponce actualApiResponce = new ApiResponce("Not all who wander are lost", true);
        actualApiResponce.setMessage("Not all who wander are lost");
        actualApiResponce.setSuccess(true);
        assertEquals("Not all who wander are lost", actualApiResponce.getMessage());
        assertTrue(actualApiResponce.isSuccess());
    }
}

