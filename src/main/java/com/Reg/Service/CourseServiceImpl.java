package com.Reg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reg.Dao.CourseDao;
import com.Reg.Model.Course;
@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseDao courseDao;
	
	@Transactional
	public void save(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
	}

}
