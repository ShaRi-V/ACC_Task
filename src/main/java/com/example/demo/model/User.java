package com.example.demo.model;

import java.util.Collection;
import javax.persistence.*; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User", uniqueConstraints = @UniqueConstraint(columnNames = "email"))  
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String username;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "user_roles",
			joinColumns = @JoinColumn(
					name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(
					name = "user_id", referencedColumnName = "id"))
	private Collection<role> roles;
	
	public User() {
		
	}
	
	public User(String email, String username, String password, Collection<role> roles) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public Collection<role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<role> roles) {
		this.roles = roles;
	}
	
	

}
