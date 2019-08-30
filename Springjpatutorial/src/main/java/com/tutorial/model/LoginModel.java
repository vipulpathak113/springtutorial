package com.tutorial.model;
import java.io.Serializable;
public class LoginModel implements Serializable {
    private static final long serialVersionUID = 4865903039190150223L;
    private long id;
    private String username;
    private String password;
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
	@Override
	public String toString() {
		return "LoginModel [id=" + id + ", username=" + username + ", password=" + password + ", token=" + token + "]";
	}
	
 
 
    
}