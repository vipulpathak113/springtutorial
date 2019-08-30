package com.tutorial.login.dao;

import java.util.List;

import com.tutorial.entity.LoginEntity;

public interface LoginDao {
	 List<LoginEntity> listUsers();
}		