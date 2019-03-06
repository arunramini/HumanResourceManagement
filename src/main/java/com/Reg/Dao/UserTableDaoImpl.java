package com.Reg.Dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Reg.Model.UserTable;

@Repository
public class UserTableDaoImpl implements UserTableDao {

	@Autowired
	public SessionFactory sessionFactory;

	public void save(UserTable userTable) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(userTable);
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
