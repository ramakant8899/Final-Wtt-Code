package com.coursemanagesystem.services;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.coursemanagesystem.entities.Course;
import com.coursemanagesystem.entities.UserApply;
import com.coursemanagesystem.exceptions.DuplicateEntryExistException;
import com.coursemanagesystem.repositories.UserApplyRepo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {UserApplyService.class})
@ExtendWith(SpringExtension.class)
class UserApplyServiceTest {
    @MockBean
    private UserApplyRepo userApplyRepo;

    @Autowired
    private UserApplyService userApplyService;

   
    @Test
    void testGetAllUser() {
        ArrayList<UserApply> userApplyList = new ArrayList<>();
        when(userApplyRepo.findAll()).thenReturn(userApplyList);
        Object actualAllUser = userApplyService.getAllUser();
        assertSame(userApplyList, actualAllUser);
        assertTrue(((Collection<Object>) actualAllUser).isEmpty());
        verify(userApplyRepo).findAll();
    }

   
    @Test
    void testGetAllUser2() {
        when(userApplyRepo.findAll()).thenThrow(new DuplicateEntryExistException("Msg"));
        assertThrows(DuplicateEntryExistException.class, () -> userApplyService.getAllUser());
        verify(userApplyRepo).findAll();
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
        userApply1.setPhoneno("4105551212");
        userApply1.setQualification("Qualification");
        Optional<UserApply> ofResult = Optional.of(userApply1);
        when(userApplyRepo.save((UserApply) any())).thenReturn(userApply);
        when(userApplyRepo.findByEmail((String) any())).thenReturn(ofResult);

        Course course2 = new Course();
        course2.setDescription("The characteristics of someone or something");
        course2.setDuration("Duration");
        course2.setFee(1);
        course2.setId(1);
        course2.setImage("Image");
        course2.setName("Name");

        UserApply userApply2 = new UserApply();
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        userApply2.setAddedDate(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        userApply2.setAddress("42 Main St");
        userApply2.setCourse(course2);
        userApply2.setEmail("jane.doe@example.org");
        userApply2.setId(1);
        userApply2.setName("Name");
//        userApply2.setPassword("iloveyou");
        userApply2.setPhoneno("4105551212");
        userApply2.setQualification("Qualification");
        assertThrows(DuplicateEntryExistException.class, () -> userApplyService.saveAllUser(userApply2));
        verify(userApplyRepo).findByEmail((String) any());
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
        when(userApplyRepo.save((UserApply) any())).thenReturn(userApply);
        when(userApplyRepo.findByEmail((String) any())).thenReturn(Optional.empty());

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
        userApply1.setPhoneno("4105551212");
        userApply1.setQualification("Qualification");
        assertSame(userApply, userApplyService.saveAllUser(userApply1));
        verify(userApplyRepo).save((UserApply) any());
        verify(userApplyRepo).findByEmail((String) any());
    }

   
    @Test
    void testGetByEmail() {
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
        when(userApplyRepo.getByEmail((String) any())).thenReturn(userApply);
        assertSame(userApply, userApplyService.getByEmail("jane.doe@example.org"));
        verify(userApplyRepo).getByEmail((String) any());
    }

    
    @Test
    void testGetByEmail2() {
        when(userApplyRepo.getByEmail((String) any())).thenThrow(new DuplicateEntryExistException("Msg"));
        assertThrows(DuplicateEntryExistException.class, () -> userApplyService.getByEmail("jane.doe@example.org"));
        verify(userApplyRepo).getByEmail((String) any());
    }
}

