package com.bags.best.the.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	private int id;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_phone")
	private String phone;
	@Column(name = "user_email")
	private String email;
	@Column(name = "user_password")
	private String password;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Address> addresses = new HashSet<>();

	public User()
	{
	}

	public User(String name, String phone, String email, String password, Set<Address> addresses)
	{
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.addresses = addresses;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Set<Address> getAddresses()
	{
		return addresses;
	}

	public void setAddresses(Set<Address> addresses)
	{
		this.addresses = addresses;
	}
}
