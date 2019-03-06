package com.Reg.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Reg.Model.Teacher;

@Repository
public class TeacherDaoImpl implements TeacherDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	

	public void save(Teacher teacher) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(teacher);
		
	}

}
