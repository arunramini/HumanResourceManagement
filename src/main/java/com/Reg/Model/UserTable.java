package com.Reg.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usertable")
public class UserTable {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private String role;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CustomerAustrailaId")
	private CustomerAustralia customerAustrailaId;

	public UserTable() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public CustomerAustralia getCustomerAustrailaId() {
		return customerAustrailaId;
	}

	public void setCustomerAustrailaId(CustomerAustralia customerAustrailaId) {
		this.customerAustrailaId = customerAustrailaId;
	}

	

	

}
