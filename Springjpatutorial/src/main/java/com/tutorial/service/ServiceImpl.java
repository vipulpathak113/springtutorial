package com.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tutorial.entity.LoginEntity;
import com.tutorial.login.dao.LoginDao;

@Service
public class ServiceImpl implements LoginService {
       
	@Autowired
	   private LoginDao userDao;
	
	
	public List<LoginEntity> listUsers() {
		return (List<LoginEntity>) userDao.listUsers();
	}

}
