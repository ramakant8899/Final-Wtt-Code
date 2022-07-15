package com.coursemanagesystem.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.coursemanagesystem.apiresponce.ApiResponce;

import javax.management.RuntimeErrorException;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class GlobalExceptionHandlerTest {
   
    @Test
    void testResourceNotFoundExceptionHandler() {
        GlobalExceptionHandler globalExceptionHandler = new GlobalExceptionHandler();
        ResponseEntity<ApiResponce> actualResourceNotFoundExceptionHandlerResult = globalExceptionHandler
                .resourceNotFoundExceptionHandler(new ResourceNotFoundException("Resource Name", "Field Name", 1));
        assertTrue(actualResourceNotFoundExceptionHandlerResult.hasBody());
        assertTrue(actualResourceNotFoundExceptionHandlerResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.NOT_FOUND, actualResourceNotFoundExceptionHandlerResult.getStatusCode());
        ApiResponce body = actualResourceNotFoundExceptionHandlerResult.getBody();
        assertFalse(body.isSuccess());
        assertEquals("Resource Name not found with Field Name : 1", body.getMessage());
    }


    @Test
    void testHandleRuntimeErrorException() {
        GlobalExceptionHandler globalExceptionHandler = new GlobalExceptionHandler();
        ResponseEntity<ApiResponce> actualHandleRuntimeErrorExceptionResult = globalExceptionHandler
                .handleRuntimeErrorException(new RuntimeErrorException(new Error("foo")));
        assertTrue(actualHandleRuntimeErrorExceptionResult.hasBody());
        assertTrue(actualHandleRuntimeErrorExceptionResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleRuntimeErrorExceptionResult.getStatusCode());
        ApiResponce body = actualHandleRuntimeErrorExceptionResult.getBody();
        assertFalse(body.isSuccess());
        assertNull(body.getMessage());
    }

    @Test
    void testHandleUpdateFailException() {
        GlobalExceptionHandler globalExceptionHandler = new GlobalExceptionHandler();
        ResponseEntity<String> actualHandleUpdateFailExceptionResult = globalExceptionHandler
                .handleUpdateFailException(new DuplicateEntryExistException("Msg"));
        assertEquals("Msg", actualHandleUpdateFailExceptionResult.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, actualHandleUpdateFailExceptionResult.getStatusCode());
        assertTrue(actualHandleUpdateFailExceptionResult.getHeaders().isEmpty());
    }


}

