package com.Reg.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Reg.Model.Instructor;
@Repository
public class InstructorDaoImpl implements InstructorDao{

	@Autowired 
	SessionFactory sessionFactory;
	
	public void save(Instructor instructor) {
		// TODO Auto-generated method stub
	
		sessionFactory.getCurrentSession().save(instructor);
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
