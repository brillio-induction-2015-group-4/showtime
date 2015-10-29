package com.brillio.showtime.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private int id;

	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String gender;
	
	@Column(name = "membership_type")
	private String memberType;
	
	@Column(name = "phone_1")
	private String phone1;
	@Column(name = "phone_2")
	private String phone2;
	@Column(name = "address_line_1")
	private String addressLine1;
	@Column(name = "address_line_2")
	private String addressLine2;
	private String landmark;
	private String city;
	private long pincode;
	@Column(name = "cust_image_path")
	private String custImagePath;
	@Column(name = "id_proof")
	private String idProof;
	@Column(name = "id_proof_path")
	private String idProofPath;
	@Column(name = "customer_status")
	private String custStatus;
	@Column(name = "initial_amount")
	private int initialAmount;

	public Customer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getCustImagePath() {
		return custImagePath;
	}

	public void setCustImagePath(String custImagePath) {
		this.custImagePath = custImagePath;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getIdProofPath() {
		return idProofPath;
	}

	public void setIdProofPath(String idProofPath) {
		this.idProofPath = idProofPath;
	}

	public String getCustStatus() {
		return custStatus;
	}

	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}

	public int getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(int initialAmount) {
		this.initialAmount = initialAmount;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer [id=%s, firstName=%s, lastName=%s, gender=%s, memberType=%s, phone1=%s, phone2=%s, addressLine1=%s, addressLine2=%s, landmark=%s, city=%s, pincode=%s, custImagePath=%s, idProof=%s, idProofPath=%s, custStatus=%s, initialAmount=%s]",
				id, firstName, lastName, gender, memberType, phone1, phone2, addressLine1, addressLine2, landmark, city,
				pincode, custImagePath, idProof, idProofPath, custStatus, initialAmount);
	}

	

}
