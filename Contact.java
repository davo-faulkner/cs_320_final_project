package org.snhu.cs320.contact;

import org.snhu.cs320.exceptions.ValidationException;
import org.snhu.cs320.validation.Validation;

public class Contact {
	
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String id, String firstName, String lastName, String phone, 
			String address) throws ValidationException {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
		validate();
	}
	
	void validate() throws ValidationException {
		// ID
		Validation.validateNotBlank(id, "id");
		Validation.validateLength(id, "id", 1, 10);
		
		// First Name
		Validation.validateNotBlank(firstName, "firstName");
		Validation.validateLength(firstName, "firstName", 1, 10);
		
		// Last Name
		Validation.validateNotBlank(lastName, "lastName");
		Validation.validateLength(lastName, "lastName", 1, 10);
		
		// Phone
		Validation.validateNotBlank(phone, "phone");
		Validation.validateLength(phone, "phone", 10, 10);
		Validation.validateNumeric(phone, "phone");
		
		// Address
		Validation.validateNotBlank(address, "address");
		Validation.validateLength(address, "address", 1, 30);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws ValidationException {
		Validation.validateNotBlank(firstName, "firstName");
		Validation.validateLength(firstName, "firstName", 1, 10);
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws ValidationException {
		Validation.validateNotBlank(lastName, "lastName");
		Validation.validateLength(lastName, "lastName", 1, 10);
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) throws ValidationException {
		Validation.validateNotBlank(phone, "phone");
		Validation.validateLength(phone, "phone", 10, 10);
		Validation.validateNumeric(phone, "phone");
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) throws ValidationException {
		Validation.validateNotBlank(address, "address");
		Validation.validateLength(address, "address", 1, 30);
		this.address = address;
	}

	public String getId() {
		return id;
	}
	
	
	
}