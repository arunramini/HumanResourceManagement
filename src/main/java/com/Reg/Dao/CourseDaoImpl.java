package com.Reg.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Reg.Model.Course;
@Repository
public class CourseDaoImpl implements CourseDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Course course) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(course);
	}

}
