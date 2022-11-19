package com.example.OAUTH2.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Entity
@Table(name = "Role")
public class Role implements GrantedAuthority{
	@Id
	private Integer id;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(Integer id, String name, Set<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.users = users;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	private String name;
	@ManyToMany(mappedBy = "roles")
	private Set<User> users;
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return name;
	}

}
