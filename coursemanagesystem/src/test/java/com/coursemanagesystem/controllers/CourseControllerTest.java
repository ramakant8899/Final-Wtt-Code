package com.coursemanagesystem.controllers;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import com.coursemanagesystem.entities.Course;
import com.coursemanagesystem.services.CourseService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {CourseController.class})
@ExtendWith(SpringExtension.class)
class CourseControllerTest {
    @Autowired
    private CourseController courseController;

    @MockBean
    private CourseService courseService;

   
    @Test
    void testGetAllCourses() throws Exception {
        when(courseService.getAllCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetAllCourses2() throws Exception {
        when(courseService.getAllCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/course");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetAllCourses3() throws Exception {
        when(courseService.getAllCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetAllCourses4() throws Exception {
        when(courseService.getAllCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/course");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

   
    @Test
    void testGetAllCourses5() throws Exception {
        when(courseService.getAllCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetAllCourses6() throws Exception {
        when(courseService.getAllCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/course");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetAllCourses7() throws Exception {
        when(courseService.getAllCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetAllCourses8() throws Exception {
        when(courseService.getAllCourses()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/course");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

   
    @Test
    void testGetCourseById() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.getCourseById(anyInt())).thenReturn(course);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course/{id}", 1);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

   
    @Test
    void testGetCourseById2() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.getCourseById(anyInt())).thenReturn(course);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course/{id}", 1);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

    
    @Test
    void testGetCourseById3() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.getCourseById(anyInt())).thenReturn(course);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course/{id}", 1);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

    
    @Test
    void testGetCourseById4() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.getCourseById(anyInt())).thenReturn(course);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course/{id}", 1);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

   
    @Test
    void testSaveAllCourse() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.saveAllCourse((Course) any())).thenReturn(course);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(course1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/course")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

    
    @Test
    void testSaveAllCourse2() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.saveAllCourse((Course) any())).thenReturn(course);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(course1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/course")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

   
    @Test
    void testSaveAllCourse3() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.saveAllCourse((Course) any())).thenReturn(course);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(course1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/course")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

   
    @Test
    void testSaveAllCourse4() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.saveAllCourse((Course) any())).thenReturn(course);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(course1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/course")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

   
    @Test
    void testUpdateCourse() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.updateCourse((Course) any(), anyInt())).thenReturn(course);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(course1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/update/{id}", 1)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

   
    @Test
    void testUpdateCourse2() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.updateCourse((Course) any(), anyInt())).thenReturn(course);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(course1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/update/{id}", 1)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

    
    @Test
    void testUpdateCourse3() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.updateCourse((Course) any(), anyInt())).thenReturn(course);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(course1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/update/{id}", 1)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

   
    @Test
    void testUpdateCourse4() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");
        when(courseService.updateCourse((Course) any(), anyInt())).thenReturn(course);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(course1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/update/{id}", 1)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration"
                                        + "\",\"fee\":1,\"image\":\"Image\"}"));
    }

    
    @Test
    void testDeleteById() throws Exception {
        doNothing().when(courseService).deleteById(anyInt());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/course/{id}", 1);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"message\":\"Course Deleted Successfully\",\"success\":true}"));
    }

    
    @Test
    void testDeleteById2() throws Exception {
        doNothing().when(courseService).deleteById(anyInt());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/course/{id}", 1);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"message\":\"Course Deleted Successfully\",\"success\":true}"));
    }

    
    @Test
    void testDeleteById3() throws Exception {
        doNothing().when(courseService).deleteById(anyInt());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/course/{id}", 1);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"message\":\"Course Deleted Successfully\",\"success\":true}"));
    }

    
    @Test
    void testDeleteById4() throws Exception {
        doNothing().when(courseService).deleteById(anyInt());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/course/{id}", 1);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"message\":\"Course Deleted Successfully\",\"success\":true}"));
    }

   
    @Test
    void testDeleteById5() throws Exception {
        doNothing().when(courseService).deleteById(anyInt());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/course/{id}", 1);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"message\":\"Course Deleted Successfully\",\"success\":true}"));
    }

   
    @Test
    void testDeleteById6() throws Exception {
        doNothing().when(courseService).deleteById(anyInt());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/course/{id}", 1);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"message\":\"Course Deleted Successfully\",\"success\":true}"));
    }

    
    @Test
    void testDeleteById7() throws Exception {
        doNothing().when(courseService).deleteById(anyInt());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/course/{id}", 1);
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"message\":\"Course Deleted Successfully\",\"success\":true}"));
    }

   
    @Test
    void testDeleteById8() throws Exception {
        doNothing().when(courseService).deleteById(anyInt());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/course/{id}", 1);
        deleteResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"message\":\"Course Deleted Successfully\",\"success\":true}"));
    }

   
    @Test
    void testGetCourses() throws Exception {
        when(courseService.getCourses((String) any())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course1/{name}", "Name");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

   
    @Test
    void testGetCourses2() throws Exception {
        when(courseService.getCourses((String) any())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/course1/{name}", "Name");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetCourses3() throws Exception {
        when(courseService.getCourses((String) any())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course1/{name}", "Name");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetCourses4() throws Exception {
        when(courseService.getCourses((String) any())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/course1/{name}", "Name");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }
}

