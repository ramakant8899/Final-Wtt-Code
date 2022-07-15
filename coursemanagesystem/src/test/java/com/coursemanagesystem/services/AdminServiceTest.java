package com.coursemanagesystem.services;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.coursemanagesystem.entities.Admin;
import com.coursemanagesystem.repositories.AdminRepo;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {AdminService.class})
@ExtendWith(SpringExtension.class)
class AdminServiceTest {
    @MockBean
    private AdminRepo adminRepo;

    @Autowired
    private AdminService adminService;

    
    @Test
    void testGetAllAdmin() {
        ArrayList<Admin> adminList = new ArrayList<>();
        when(adminRepo.findAll()).thenReturn(adminList);
        List<Admin> actualAllAdmin = adminService.getAllAdmin();
        assertSame(adminList, actualAllAdmin);
        assertTrue(actualAllAdmin.isEmpty());
        verify(adminRepo).findAll();
    }


    @Test
    void testFindDetailByEmail() {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setPassword("iloveyou");
        when(adminRepo.findByEmail((String) any())).thenReturn(admin);
        assertSame(admin, adminService.findDetailByEmail("jane.doe@example.org"));
        verify(adminRepo).findByEmail((String) any());
    }

    
    @Test
    void testFindDetailByEmail2() {
        Admin admin = new Admin();
        admin.setEmail("jane.doe@example.org");
        admin.setPassword("iloveyou");
        when(adminRepo.findByEmail((String) any())).thenReturn(admin);
        assertThrows(RuntimeErrorException.class,
                () -> adminService.findDetailByEmail("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"));
    }


    @Test
    void testFindDetailByEmail4() {
        when(adminRepo.findByEmail((String) any())).thenThrow(new RuntimeErrorException(new Error("UUU@UUU")));
        assertThrows(RuntimeErrorException.class, () -> adminService.findDetailByEmail("jane.doe@example.org"));
        verify(adminRepo).findByEmail((String) any());
    }

   
    @Test
    void testValidateEmailId() {
        assertTrue(adminService.validateEmailId("jane.doe@example.org"));
        assertFalse(adminService.validateEmailId("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"));
    }
}

