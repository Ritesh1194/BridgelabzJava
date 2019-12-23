package com.bridgelabz.jdbc.login;

public class LoginForm {
	private String firstName;
	private String lastname;
	private String email;
	private String pasword;
	private String location;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "LoginForm [firstName=" + firstName + ", lastname=" + lastname + ", email=" + email + ", pasword="
				+ pasword + ", location=" + location + "]";
	}
}