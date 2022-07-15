package com.coursemanagesystem.controllers;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.coursemanagesystem.entities.Course;
import com.coursemanagesystem.entities.UserApply;
import com.coursemanagesystem.services.UserApplyService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

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

@ContextConfiguration(classes = {UserApplyController.class})
@ExtendWith(SpringExtension.class)
class UserApplyControllerTest {
    @Autowired
    private UserApplyController userApplyController;

    @MockBean
    private UserApplyService userApplyService;

   
    @Test
    void testGetAllUser() throws Exception {
        when(userApplyService.getAllUser()).thenReturn("All User");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user");
        MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("All User"));
    }

   
    @Test
    void testGetAllUser2() throws Exception {
        when(userApplyService.getAllUser()).thenReturn("All User");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user");
        MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("All User"));
    }

   
    @Test
    void testGetAllUser3() throws Exception {
        when(userApplyService.getAllUser()).thenReturn("All User");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user");
        MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("All User"));
    }

   
    @Test
    void testGetAllUser4() throws Exception {
        when(userApplyService.getAllUser()).thenReturn("All User");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user");
        MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
                .andExpect(MockMvcResultMatchers.content().string("All User"));
    }

    
    @Test
    void testSaveAllUser2() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");

        UserApply userApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply.setAddedDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        userApply.setAddress("42 Main St");
        userApply.setCourse(course);
        userApply.setEmail("jane.doe@example.org");
        userApply.setId(1);
        userApply.setName("Name");
//        userApply.setPassword("iloveyou");
        userApply.setPhoneno("4105551212");
        userApply.setQualification("Qualification");
        when(userApplyService.saveAllUser((UserApply) any())).thenReturn(userApply);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");

        UserApply userApply1 = new UserApply();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply1.setAddedDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        userApply1.setAddress("42 Main St");
        userApply1.setCourse(course1);
        userApply1.setEmail("jane.doe@example.org");
        userApply1.setId(1);
        userApply1.setName("Name");
//        userApply1.setPassword("iloveyou");
        userApply1.setPhoneno("+91  -  9999999999");
        userApply1.setQualification("Qualification");
        String content = (new ObjectMapper()).writeValueAsString(userApply1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder);
//        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
//                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
//                .andExpect(MockMvcResultMatchers.content()
//                        .string(
//                                "{\"id\":1,\"name\":\"Name\",\"email\":\"jane.doe@example.org\",\"qualification\":\"Qualification\",\"phoneno\":"
//                                        + "\"4105551212\",\"address\":\"42 Main St\",\"addedDate\":0,\"password\":\"iloveyou\",\"course\":{\"id\":1,\"name\":"
//                                        + "\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration\",\"fee\":1,"
//                                        + "\"image\":\"Image\"}}"));
    }

    /**
     * Method under test: {@link UserApplyController#saveAllUser(UserApply)}
     */
    @Test
    void testSaveAllUser4() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");

        UserApply userApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply.setAddedDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        userApply.setAddress("42 Main St");
        userApply.setCourse(course);
        userApply.setEmail("jane.doe@example.org");
        userApply.setId(1);
        userApply.setName("Name");
//        userApply.setPassword("iloveyou");
        userApply.setPhoneno("4105551212");
        userApply.setQualification("Qualification");
        when(userApplyService.saveAllUser((UserApply) any())).thenReturn(userApply);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");

        UserApply userApply1 = new UserApply();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply1.setAddedDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        userApply1.setAddress("42 Main St");
        userApply1.setCourse(course1);
        userApply1.setEmail("jane.doe@example.org");
        userApply1.setId(1);
        userApply1.setName("Name");
//        userApply1.setPassword("iloveyou");
        userApply1.setPhoneno("+91  -  9999999999");
        userApply1.setQualification("Qualification");
        String content = (new ObjectMapper()).writeValueAsString(userApply1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        @SuppressWarnings("unused")
		ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder);
//        actualPerformResult.andExpect(MockMvcResultMatchers.status().isCreated())
//                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
//                .andExpect(MockMvcResultMatchers.content()
//                        .string(
//                                "{\"id\":1,\"name\":\"Name\",\"email\":\"jane.doe@example.org\",\"qualification\":\"Qualification\",\"phoneno\":"
//                                        + "\"4105551212\",\"address\":\"42 Main St\",\"addedDate\":0,\"password\":\"iloveyou\",\"course\":{\"id\":1,\"name\":"
//                                        + "\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration\",\"fee\":1,"
//                                        + "\"image\":\"Image\"}}"));
    }

    
    @Test
    void testSaveAllUser6() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");

        UserApply userApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply.setAddedDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        userApply.setAddress("42 Main St");
        userApply.setCourse(course);
        userApply.setEmail("jane.doe@example.org");
        userApply.setId(1);
        userApply.setName("Name");
//        userApply.setPassword("iloveyou");
        userApply.setPhoneno("4105551212");
        userApply.setQualification("Qualification");
        when(userApplyService.saveAllUser((UserApply) any())).thenReturn(userApply);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");

        UserApply userApply1 = new UserApply();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply1.setAddedDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        userApply1.setAddress("42 Main St");
        userApply1.setCourse(course1);
        userApply1.setEmail("jane.doe@example.org");
        userApply1.setId(1);
        userApply1.setName("Name");
//        userApply1.setPassword("iloveyou");
        userApply1.setPhoneno("+91  -  9999999999");
        userApply1.setQualification("Qualification");
        String content = (new ObjectMapper()).writeValueAsString(userApply1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"email\":\"jane.doe@example.org\",\"qualification\":\"Qualification\",\"phoneno\":"
                                        + "\"4105551212\",\"address\":\"42 Main St\",\"addedDate\":0,\"password\":\"iloveyou\",\"course\":{\"id\":1,\"name\":"
                                        + "\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration\",\"fee\":1,"
                                        + "\"image\":\"Image\"}}"));
    }

    
    @Test
    void testSaveAllUser8() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");

        UserApply userApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply.setAddedDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        userApply.setAddress("42 Main St");
        userApply.setCourse(course);
        userApply.setEmail("jane.doe@example.org");
        userApply.setId(1);
        userApply.setName("Name");
//        userApply.setPassword("iloveyou");
        userApply.setPhoneno("4105551212");
        userApply.setQualification("Qualification");
        when(userApplyService.saveAllUser((UserApply) any())).thenReturn(userApply);

        Course course1 = new Course();
        course1.setDescription("The characteristics of someone or something");
        course1.setDuration("Duration");
        course1.setFee(1);
        course1.setId(1);
        course1.setImage("Image");
        course1.setName("Name");

        UserApply userApply1 = new UserApply();
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply1.setAddedDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        userApply1.setAddress("42 Main St");
        userApply1.setCourse(course1);
        userApply1.setEmail("jane.doe@example.org");
        userApply1.setId(1);
        userApply1.setName("Name");
//        userApply1.setPassword("iloveyou");
        userApply1.setPhoneno("+91  -  9999999999");
        userApply1.setQualification("Qualification");
        String content = (new ObjectMapper()).writeValueAsString(userApply1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"email\":\"jane.doe@example.org\",\"qualification\":\"Qualification\",\"phoneno\":"
                                        + "\"4105551212\",\"address\":\"42 Main St\",\"addedDate\":0,\"password\":\"iloveyou\",\"course\":{\"id\":1,\"name\":"
                                        + "\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration\",\"fee\":1,"
                                        + "\"image\":\"Image\"}}"));
    }

    @Test
    void testGetByEmail4() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");

        UserApply userApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply.setAddedDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        userApply.setAddress("42 Main St");
        userApply.setCourse(course);
        userApply.setEmail("jane.doe@example.org");
        userApply.setId(1);
        userApply.setName("Name");
//        userApply.setPassword("iloveyou");
        userApply.setPhoneno("4105551212");
        userApply.setQualification("Qualification");
        when(userApplyService.getByEmail((String) any())).thenReturn(userApply);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/userlogin").param("email", "foo");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isAccepted())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"name\":\"Name\",\"email\":\"jane.doe@example.org\",\"qualification\":\"Qualification\",\"phoneno\":"
                                        + "\"4105551212\",\"address\":\"42 Main St\",\"addedDate\":0,\"password\":\"iloveyou\",\"course\":{\"id\":1,\"name\":"
                                        + "\"Name\",\"description\":\"The characteristics of someone or something\",\"duration\":\"Duration\",\"fee\":1,"
                                        + "\"image\":\"Image\"}}"));
    }

    @Test
    void testSaveAllUser() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");

        UserApply userApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply.setAddedDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        userApply.setAddress("42 Main St");
        userApply.setCourse(course);
        userApply.setEmail("jane.doe@example.org");
        userApply.setId(1);
        userApply.setName("Name");
//        userApply.setPassword("iloveyou");
        userApply.setPhoneno("4105551212");
        userApply.setQualification("Qualification");
        String content = (new ObjectMapper()).writeValueAsString(userApply);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400));
    }

    
    @Test
    void testSaveAllUser3() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");

        UserApply userApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply.setAddedDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        userApply.setAddress("42 Main St");
        userApply.setCourse(course);
        userApply.setEmail("jane.doe@example.org");
        userApply.setId(1);
        userApply.setName("Name");
//        userApply.setPassword("iloveyou");
        userApply.setPhoneno("4105551212");
        userApply.setQualification("Qualification");
        String content = (new ObjectMapper()).writeValueAsString(userApply);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400));
    }

    
    @Test
    void testSaveAllUser5() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");

        UserApply userApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply.setAddedDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        userApply.setAddress("42 Main St");
        userApply.setCourse(course);
        userApply.setEmail("jane.doe@example.org");
        userApply.setId(1);
        userApply.setName("Name");
//        userApply.setPassword("iloveyou");
        userApply.setPhoneno("4105551212");
        userApply.setQualification("Qualification");
        String content = (new ObjectMapper()).writeValueAsString(userApply);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400));
    }

    
    @Test
    void testSaveAllUser7() throws Exception {
        Course course = new Course();
        course.setDescription("The characteristics of someone or something");
        course.setDuration("Duration");
        course.setFee(1);
        course.setId(1);
        course.setImage("Image");
        course.setName("Name");

        UserApply userApply = new UserApply();
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply.setAddedDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        userApply.setAddress("42 Main St");
        userApply.setCourse(course);
        userApply.setEmail("jane.doe@example.org");
        userApply.setId(1);
        userApply.setName("Name");
//        userApply.setPassword("iloveyou");
        userApply.setPhoneno("4105551212");
        userApply.setQualification("Qualification");
        String content = (new ObjectMapper()).writeValueAsString(userApply);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(userApplyController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400));
    }
}

