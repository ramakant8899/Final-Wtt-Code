package com.coursemanagesystem.repositories;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursemanagesystem.entities.UserApply;

public interface UserApplyRepo extends JpaRepository<UserApply, String>
{

	UserApply getByEmail(@Valid String email);

	Optional<UserApply> findByEmail(String email);
	
}
