package com.example.amsadminapi.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

	@Id
	private Long id;
	private String email;
	private String firstName;
	private String lastName;
	private String displayName;
	private String[] userStatus= {"A","D"};
	private LocalDateTime createdOn;
	private String userGroups;

	public User(Long id, String email, String firstName, String lastName, String displayName, String[] userStatus,
			LocalDateTime createdOn, String userGroups) {
		super();
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.displayName = displayName;
		this.userStatus = userStatus;
		this.createdOn = createdOn;
		this.userGroups = userGroups;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String[] getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String[] userStatus) {
		this.userStatus = userStatus;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public String getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(String userGroups) {
		this.userGroups = userGroups;
	}

}