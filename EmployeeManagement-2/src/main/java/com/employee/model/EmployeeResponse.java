package com.employee.model;

public class EmployeeResponse {

	private int empId;
	private String employeeReferenceNumber;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int pinCode;
	private long mobileNumber;
	private String emailId;
	public int getEmpId() {
		return empId;
	}
	public String getEmployeeReferenceNumber() {
		return employeeReferenceNumber;
	}
	public void setEmployeeReferenceNumber(String employeeReferenceNumber) {
		this.employeeReferenceNumber = employeeReferenceNumber;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public EmployeeResponse(int empId, String firstName, String lastName, String address, String city, String state,
			int pinCode, long mobileNumber, String emailId) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	public EmployeeResponse() {
		super();
		
	}
	
	
}

