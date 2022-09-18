package com.MongoDBAPI;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hospital")
public class Hospital {
	
	int PatientId;
	String PatientName;
	int ContactNumber;
	
	@Override
	public String toString() {
		return "Hospital [PatientId=" + PatientId + ", PatientName=" + PatientName + ", ContactNumber=" + ContactNumber
				+ "]";
	}

	public Hospital(int patientId, String patientName, int contactNumber) {
		super();
		PatientId = patientId;
		PatientName = patientName;
		ContactNumber = contactNumber;
	}

	public Hospital() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(ContactNumber, PatientId, PatientName);
	}

	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	public String getPatientName() {
		return PatientName;
	}

	public void setPatientName(String patientName) {
		PatientName = patientName;
	}

	public int getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(int contactNumber) {
		ContactNumber = contactNumber;
	}
}
