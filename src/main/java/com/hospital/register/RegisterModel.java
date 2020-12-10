package com.hospital.register;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegisterModel {
	private String name;
    private int age;
    private Date dateOfBirth;
    private String bloodGroup;
    private String address;
    private String mobNo;
    @Id
    private String email;
    private Date dateOfAppointment;
	
	
	public RegisterModel() {

	}
	
	public RegisterModel(String name,int age,Date dateOfBirth, String bloodGroup, String address, String mobNo, String email,Date dateOfAppointment) {
		super();
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.bloodGroup = bloodGroup;
		this.address = address;
		this.mobNo = mobNo;
		this.email = email;
		this.dateOfAppointment = dateOfAppointment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(Date dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}
	
	
	
	
}
