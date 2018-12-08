package com.jojo.clt.location.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	@Id
	private Number id;
	private String firstName;
	private String lastName;
	private String email;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Messenger> Messenger = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Sender> Sender = new ArrayList<>();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Messenger> getMessenger() {
		return Messenger;
	}
	public void setMessenger(List<Messenger> messenger) {
		Messenger = messenger;
	}
	public List<Sender> getSender() {
		return Sender;
	}
	public void setSender(List<Sender> sender) {
		Sender = sender;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	  
	}
