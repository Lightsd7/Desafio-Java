package com.desafio.company.entity;

import java.util.List;

import com.desafio.company.VO.User;

public class Users {

	private List<User> users;

	public Users(List<User> users) {
		super();
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
