package com.shop.partner;

public abstract class Person {
	private String personID;
	private String lastName;
	private String firstName;
	
	protected Person(String personId) {
		this.setPersonID(personId);
	}
	
	public String getPersonID() {
		return personID;
	}
	protected void setPersonID(String personID) {
		this.personID = personID;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}
