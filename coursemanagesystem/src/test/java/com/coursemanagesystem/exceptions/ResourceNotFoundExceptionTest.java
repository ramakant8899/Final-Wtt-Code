package com.coursemanagesystem.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ResourceNotFoundExceptionTest {
   
    @Test
    void testConstructor() {
        ResourceNotFoundException actualResourceNotFoundException = new ResourceNotFoundException("Resource Name",
                "Field Name", 1);

        assertEquals("Resource Name", actualResourceNotFoundException.resourceName);
        assertEquals(1, actualResourceNotFoundException.fieldValueid);
        assertEquals("Field Name", actualResourceNotFoundException.fieldName);
    }

    
    @Test
    void testConstructor2() {
        ResourceNotFoundException actualResourceNotFoundException = new ResourceNotFoundException("Resource Name",
                "Field Name", 1);

        assertEquals("Resource Name", actualResourceNotFoundException.resourceName);
        assertEquals(1, actualResourceNotFoundException.fieldValueid);
        assertEquals("Field Name", actualResourceNotFoundException.fieldName);
    }

   
    @Test
    void testConstructor3() {
        ResourceNotFoundException actualResourceNotFoundException = new ResourceNotFoundException("Resource Name",
                "Field Name", 1);

        assertEquals("Resource Name", actualResourceNotFoundException.resourceName);
        assertEquals(1, actualResourceNotFoundException.fieldValueid);
        assertEquals("Field Name", actualResourceNotFoundException.fieldName);
    }
}

