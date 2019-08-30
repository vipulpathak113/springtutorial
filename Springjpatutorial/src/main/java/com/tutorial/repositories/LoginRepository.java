package com.tutorial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tutorial.entity.LoginEntity;

@Repository
@Transactional
public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
	
	public List<LoginEntity> getUser() ;
}
