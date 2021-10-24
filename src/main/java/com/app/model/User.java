package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "address_id_fk", referencedColumnName = "id")
	private Address address;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "archived_address_id_fk", referencedColumnName = "id")
	private Address archivedAddress;
	
	public Address getArchivedAddress() {
		return archivedAddress;
	}
	public void setArchivedAddress(Address archivedAddress) {
		this.archivedAddress = archivedAddress;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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

	
	public User(int id, String firstName, String lastName, String email, Address address, Address archivedAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.archivedAddress = archivedAddress;
	}
	
	public User(String firstName, String lastName, String email, Address address, Address archivedAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.archivedAddress = archivedAddress;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	

}
