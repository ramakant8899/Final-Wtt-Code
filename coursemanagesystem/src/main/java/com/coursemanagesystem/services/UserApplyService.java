package com.coursemanagesystem.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coursemanagesystem.entities.UserApply;
import com.coursemanagesystem.exceptions.DuplicateEntryExistException;
import com.coursemanagesystem.repositories.UserApplyRepo;

@Service
public class UserApplyService {
	@Autowired
	UserApplyRepo applyRepo;

	public Object getAllUser() {
		List<UserApply> allUser = this.applyRepo.findAll();
		return allUser;
	}

	public UserApply saveAllUser(@Valid UserApply apply) throws Exception {
		@SuppressWarnings("unused")
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		apply.setAddedDate(date);

		Optional<UserApply> userapply = applyRepo.findByEmail(apply.getEmail());
		try {
			if (!userapply.isPresent()) {

				return applyRepo.save(apply);

			} else {
				throw new DuplicateEntryExistException("Duplicate Entry of Email");
			}
		} catch (DuplicateEntryExistException e) {
			throw new DuplicateEntryExistException("Duplicate Entry of Email");
		}
	}

	public UserApply getByEmail(@Valid String email) {
		UserApply getUser = this.applyRepo.getByEmail(email);
		return getUser;
	}

//	public UserApply saveAllUser(@Valid UserApply apply) 
//	{
//		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
//	    Date date = new Date();  
//	    apply.setAddedDate(date);
//	    
//	    UserApply saveAll= this.useappRepo.save(apply);
//		return saveAll;
//	    
//	}

}
