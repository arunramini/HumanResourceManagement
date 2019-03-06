package com.Reg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reg.Dao.InstructorDao;
import com.Reg.Model.Instructor;

@Service
public class InstructorServiceImpl implements InstructorService{

	
	@Autowired
	public InstructorDao instructorDao;
	
	public void setInstructorDao(InstructorDao instructorDao) {
		this.instructorDao = instructorDao;
	}

	@Transactional
	public void save(Instructor instructor) {
		// TODO Auto-generated method stub
		instructorDao.save(instructor);
	}

}
