package com.Reg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reg.Dao.UserTableDao;
import com.Reg.Model.UserTable;

@Service("userTableService")
public class UserTableServiceImpl implements UserTableService {

	@Autowired
	public UserTableDao userTableDao;
	
	public void setUserTableDao(UserTableDao userTableDao) {
		this.userTableDao = userTableDao;
	}

	@Transactional
	public void save(UserTable userTable) {
		// TODO Auto-generated method stub
		userTableDao.save(userTable);
	}

}
