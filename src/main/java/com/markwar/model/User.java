package com.markwar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="AC_USER")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1020314852003757954L;
	
	@Id
	@Column(name="USER_ID", length=50, nullable=false)
	private long userId;
	@Column(name="NAME", length=50, nullable=false)
	private String name;
	@Column(name="PASSWORD", length=50, nullable=false)
	private String password;
	@Column(name="AGE", length=20, nullable=false)
	private int age;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
