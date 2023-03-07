package com.zohocrm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact extends AbstractClass {
	// AbstractClass must be MappedSuperClass to extend
	// AbstractClass created since 'id' is being used many times...So for reusablility purpose diff class created

	@Column(name = "first_name", nullable=false)
	private String firstName;
	@Column(name="last_name", nullable=false)
	private String lastName;
	@Column(name="email", nullable=false, unique=true)
	private String email;
	@Column(name="mobile", nullable=false, unique=true)
	private Long mobile; // we can also give 'long' datatype...
	private String source ;
	
	
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
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
}
