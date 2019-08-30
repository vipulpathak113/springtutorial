package com.tutorial.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "LoginEntity.getUser",
  query = "select u from user u where u.id = ?1")
public class LoginEntity implements Serializable {

    private static final long serialVersionUID = 4865903039190150223L;
    @Id
    @GeneratedValue
    private Long id;
 
    @Column(length = 50, nullable = false)
    private String username;
    
    @Column(length = 50, nullable = false)
    private String password;
    
    @Column(length = 50, nullable = false)
    private String token;

    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}