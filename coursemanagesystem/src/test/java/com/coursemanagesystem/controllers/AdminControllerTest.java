package com.coursemanagesystem.controllers;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.coursemanagesystem.entities.Admin;
import com.coursemanagesystem.services.AdminService;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {AdminController.class})
@ExtendWith(SpringExtension.class)
class AdminControllerTest {
    @Autowired
    private AdminController adminController;

    @MockBean
    private AdminService adminService;

    @Test
    void testGetAllAdmin() throws Exception {
        when(adminService.getAllAdmin()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetAllAdmin2() throws Exception {
        when(adminService.getAllAdmin()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

   
    @Test
    void testGetAllAdmin3() throws Exception {
        when(adminService.getAllAdmin()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetAllAdmin4() throws Exception {
        when(adminService.getAllAdmin()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetAllAdmin5() throws Exception {
        when(adminService.getAllAdmin()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

   
    @Test
    void testGetAllAdmin6() throws Exception {
        when(adminService.getAllAdmin()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetAllAdmin7() throws Exception {
        when(adminService.getAllAdmin()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/admin");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetAllAdmin8() throws Exception {
        when(adminService.getAllAdmin()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/admin");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    
    @Test
    void testGetByEmail() throws Exception {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setPassword("iloveyou");
        when(adminService.findDetailByEmail((String) any())).thenReturn(admin);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/login").param("email", "foo");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isAccepted())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }

    
    @Test
    void testGetByEmail2() throws Exception {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setPassword("iloveyou");
        when(adminService.findDetailByEmail((String) any())).thenReturn(admin);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/login").param("email", "foo");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isAccepted())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }

   
    @Test
    void testGetByEmail3() throws Exception {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setPassword("iloveyou");
        when(adminService.findDetailByEmail((String) any())).thenReturn(admin);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/login").param("email", "foo");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isAccepted())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }

    
    @Test
    void testGetByEmail4() throws Exception {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setPassword("iloveyou");
        when(adminService.findDetailByEmail((String) any())).thenReturn(admin);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/login").param("email", "foo");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isAccepted())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(
                        MockMvcResultMatchers.content().string("{\"email\":\"jane.doe@example.org\",\"password\":\"iloveyou\"}"));
    }
}

