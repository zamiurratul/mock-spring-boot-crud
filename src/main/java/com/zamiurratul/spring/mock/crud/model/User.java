package com.zamiurratul.spring.mock.crud.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "TEST_USERS_4")
public class User {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "user-seq-gen")
	@SequenceGenerator(name = "user-seq-gen", allocationSize = 25, sequenceName = "TEST_USERS_4_SEQ")
	private Long id;

	@NotEmpty(message = "required")
	@Column(name = "EMPLOYEE_ID")
	private String employeeId;
	
	@NotEmpty(message = "required")
	@Column(name = "FULL_NAME")
	private String fullName;
	
	@NotEmpty(message = "required")
	@Column(name = "DESIGNATION")
	private String designation;
	
	@NotEmpty(message = "required")
	@Column(name = "EMAIL")
	private String email;
	
	@NotEmpty(message = "required")
	@Column(name = "CONTACT_NO")
	private String contactNo;
	
	@NotEmpty(message = "required")
	@Column(name = "GENDER")
	private String gender;
	
	@NotEmpty(message = "required")
	@Column(name = "PASSWORD")
	private String password;
	
	@NotNull(message = "required")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "JOINING_DATE")
	private Date joiningDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", employeeId=" + employeeId + ", fullName=" + fullName + ", designation="
				+ designation + ", email=" + email + ", contactNo=" + contactNo + ", gender=" + gender
				+ ", joiningDate=" + joiningDate + "]";
	}
}
