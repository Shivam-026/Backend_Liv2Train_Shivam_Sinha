package com.sp.Backend_Liv2Train_Shivam_Sinha_project.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CenterInfo {
	@NotNull(message="Center Name Can not be empty")
	@Size(max=40)
	private String CenterName;
	@NotNull(message="Center Code Can not be empty")
	@Size(max=12)
	private long CenterCode;
	@NotNull(message="Detailed_Address Can not be empty")
	private String Detailed_Address;
	@NotNull(message="City Can not be empty")
	private String City;
	@NotNull(message="State Can not be empty")
	private String State;
	@NotNull(message="Pincode Can not be empty")
	@Size(min = 8,max=8)
	private long Pincode;

	private long Student_Capacity;
	
	private String Courses_Offered;
	private String CreatedOn;
	@Email
	private String ContactEmail;
	@NotNull(message="Center Name Can not be empty")
	@Size(min=10,max=10)
	private long ContactPhone;
	public CenterInfo(String centerName, long centerCode, String detailed_Address, String city, String state,
			long pincode, long student_Capacity, String courses_Offered, String createdOn, String contactEmail,
			long contactPhone) {
		super();
		CenterName = centerName;
		CenterCode = centerCode;
		Detailed_Address = detailed_Address;
		City = city;
		State = state;
		Pincode = pincode;
		Student_Capacity = student_Capacity;
		Courses_Offered = courses_Offered;
		CreatedOn = createdOn;
		ContactEmail = contactEmail;
		ContactPhone = contactPhone;
	}
	public CenterInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCenterName() {
		return CenterName;
	}
	public void setCenterName(String centerName) {
		CenterName = centerName;
	}
	public long getCenterCode() {
		return CenterCode;
	}
	public void setCenterCode(long centerCode) {
		CenterCode = centerCode;
	}
	public String getDetailed_Address() {
		return Detailed_Address;
	}
	public void setDetailed_Address(String detailed_Address) {
		Detailed_Address = detailed_Address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getPincode() {
		return Pincode;
	}
	public void setPincode(long pincode) {
		Pincode = pincode;
	}
	public long getStudent_Capacity() {
		return Student_Capacity;
	}
	public void setStudent_Capacity(long student_Capacity) {
		Student_Capacity = student_Capacity;
	}
	public String getCourses_Offered() {
		return Courses_Offered;
	}
	public void setCourses_Offered(String courses_Offered) {
		Courses_Offered = courses_Offered;
	}
	public String getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(String createdOn) {
		CreatedOn = createdOn;
	}
	public String getContactEmail() {
		return ContactEmail;
	}
	public void setContactEmail(String contactEmail) {
		ContactEmail = contactEmail;
	}
	public long getContactPhone() {
		return ContactPhone;
	}
	public void setContactPhone(long contactPhone) {
		ContactPhone = contactPhone;
	}
	@Override
	public String toString() {
		return "CenterInfo [CenterName=" + CenterName + ", CenterCode=" + CenterCode + ", Detailed_Address="
				+ Detailed_Address + ", City=" + City + ", State=" + State + ", Pincode=" + Pincode
				+ ", Student_Capacity=" + Student_Capacity + ", Courses_Offered=" + Courses_Offered + ", CreatedOn="
				+ CreatedOn + ", ContactEmail=" + ContactEmail + ", ContactPhone=" + ContactPhone + "]";
	}
	
	

}
