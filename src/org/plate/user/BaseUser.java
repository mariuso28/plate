package org.plate.user;

import java.util.UUID;

public class BaseUser {
	private UUID id;
	private String contact;
	private String email;
	private String phone;
	private String password;
	private boolean enabled;
	
	public BaseUser()
	{
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "BaseUser [id=" + id + ", contact=" + contact + ", email=" + email + ", phone=" + phone + ", password="
				+ password + ", enabled=" + enabled + "]";
	}
	
}
