package com.coursemanagesystem.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class DuplicateEntryExistExceptionTest {
   
    @Test
    void testConstructor() {
        DuplicateEntryExistException actualDuplicateEntryExistException = new DuplicateEntryExistException("Msg");
        assertNull(actualDuplicateEntryExistException.getCause());
        assertEquals(0, actualDuplicateEntryExistException.getSuppressed().length);
        assertEquals("Msg", actualDuplicateEntryExistException.getMessage());
        assertEquals("Msg", actualDuplicateEntryExistException.getLocalizedMessage());
    }

   
    @Test
    void testConstructor2() {
        DuplicateEntryExistException actualDuplicateEntryExistException = new DuplicateEntryExistException("Msg");
        assertNull(actualDuplicateEntryExistException.getCause());
        assertEquals(0, actualDuplicateEntryExistException.getSuppressed().length);
        assertEquals("Msg", actualDuplicateEntryExistException.getMessage());
        assertEquals("Msg", actualDuplicateEntryExistException.getLocalizedMessage());
    }

    
    @Test
    void testConstructor3() {
        DuplicateEntryExistException actualDuplicateEntryExistException = new DuplicateEntryExistException("Msg");
        assertNull(actualDuplicateEntryExistException.getCause());
        assertEquals(0, actualDuplicateEntryExistException.getSuppressed().length);
        assertEquals("Msg", actualDuplicateEntryExistException.getMessage());
        assertEquals("Msg", actualDuplicateEntryExistException.getLocalizedMessage());
    }
}

