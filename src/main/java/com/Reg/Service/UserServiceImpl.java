package com.Reg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reg.Dao.UserDao;
import com.Reg.Model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

}
