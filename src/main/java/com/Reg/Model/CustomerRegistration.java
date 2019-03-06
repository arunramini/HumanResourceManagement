package com.Reg.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customerregistration")
public class CustomerRegistration {

	@Id
	@Column(name = "custId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;

	@NotNull(message = "Name may not be null")
	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "phone")
	private String phone;

	@Column(name = "city")
	private String city;

	@Column(name = "postal")
	private String postal;

	@Column(name = "state")
	private String state;

	public CustomerRegistration() {
		// TODO Auto-generated constructor stub
	}

	public CustomerRegistration(String name, String email, String password, String phone, String city, String postal,
			String state) {

		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.city = city;
		this.postal = postal;
		this.state = state;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "CustomerRegistration [custId=" + custId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", phone=" + phone + ", city=" + city + ", postal=" + postal + ", state=" + state + "]";
	}

}
