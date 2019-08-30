package com.tutorial.login.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutorial.entity.LoginEntity;
import com.tutorial.login.dao.LoginDao;
import com.tutorial.repositories.LoginRepository;

@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private LoginRepository lr;

	@Override 
	public List<LoginEntity> listUsers() {
		return lr.getUser();
	}
    
}
