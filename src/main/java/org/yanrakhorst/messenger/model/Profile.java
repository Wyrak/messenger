package org.yanrakhorst.messenger.model;

import java.time.LocalDate;

public class Profile {
	
	private String firstName;
	private String lastName;
	private LocalDate creationDate = LocalDate.now();
	
	public Profile() {}
	
	public Profile(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	
	

}
