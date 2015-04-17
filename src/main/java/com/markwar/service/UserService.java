package com.markwar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markwar.DAO.GeneralDAO;
import com.markwar.model.User;


@Service
public class UserService {
	@Autowired
	private GeneralDAO generalDAO;
	
	public User findByUserId(long userId) {
		return generalDAO.findById(User.class, userId);
	}

	public List<User> findAll() {
		return generalDAO.findAll(User.class);
	}

	//@Transactional
	public void createUser(User user) {
		generalDAO.save(user);
	}

	//@Transactional
	public void updateUser(User user) {
		generalDAO.update(user);
	}

	//@Transactional
	public void deleteUser(long userId) {
		generalDAO.deleteById(User.class, userId);
	}

	//@Transactional
	public void deleteUser(User user) {
		generalDAO.delete(user);
	}
}
