package com.jojo.clt.location.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sender {
	@Id
	private Number id;
	private String firstName;
	private String lastName;
	private String email;
	private Number phoneNumber;
	public Number getId() {
		return id;
	}
	public void setId(Number id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return email;
	}
	public void setMail(String email) {
		this.email = email;
	}
	public Number getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Number phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Sender [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mail=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

}
