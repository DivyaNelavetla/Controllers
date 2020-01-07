package org.cap.service;

import org.cap.dao.IUserDao;
import org.cap.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	private IUserDao userDao;

	public UserServiceImpl(IUserDao dao) {
		this.userDao = dao;
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public AppUser getUserById(int id) {
		AppUser user = userDao.getUserById(id);
		return user;

	}

	@Override
	public boolean credentialsCorrect(int id, String password) {
		boolean correct = userDao.credentialsCorrect(id, password);
		return correct;

	}

}
