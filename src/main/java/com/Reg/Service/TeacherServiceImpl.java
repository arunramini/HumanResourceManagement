package com.Reg.Service;

import javax.xml.transform.Templates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reg.Dao.TeacherDao;
import com.Reg.Model.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherDao teacherDao;

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	@Transactional
	public void save(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDao.save(teacher);
	}
	

}
