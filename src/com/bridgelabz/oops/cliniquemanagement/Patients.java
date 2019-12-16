package com.bridgelabz.oops.cliniquemanagement;

/******************************************************************************
 * 
 * Purpose: This programme is used to manage a list of Doctors associated with
 * the Clinique. This also manages the list of patients who use the clinique. It
 * manages Doctors by Name, Id, Specialization and Availability (AM, PM or
 * both). It manages Patients by Name, ID, Mobile Number and Age. The Program
 * allows users to search Doctor by name, id, Specialization or Availability.
 * Also the programs allows users to search patient by name, mobile number or
 * id.
 *
 * @author Ritesh Yadav
 * @version 1.0
 * @since 02-12-2019
 *
 ******************************************************************************/
public class Patients {
	private String patientName;
	private String id;
	private long mobile;
	private int age;

	public Patients() {
		super();
	}

	public Patients(String patientName, String id, long mobile, int age) {
		super();
		this.patientName = patientName;
		this.id = id;
		this.mobile = mobile;
		this.age = age;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patients [patientName=" + patientName + ", id=" + id + ", mobile=" + mobile + ", age=" + age + "]";
	}

}