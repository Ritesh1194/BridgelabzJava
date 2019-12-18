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
 * @version 1.2
 * @since 02-12-2019
 *
 ******************************************************************************/
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import utility.Utility;

public class CliniqueManagementImpl implements CliniqueInterface {
	JSONArray jsonArray = new JSONArray();
	JSONObject jsonObject = new JSONObject();

	static String doctor = "/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/Doctor.json";
	static String patient = "/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/Patient.json";
	static String appointment = "/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/JsonFolder/appointment.json";

	/**
	 * Define function doctorDetails()
	 * 
	 * @return void
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void doctorDetails() {
		jsonArray = CliniqueRepository.readData(doctor);

		Doctor doctorDetails = new Doctor();
		System.out.println("Enter Doctor Name : ");
		String doctorName = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(doctorName)) {
			doctorDetails.setDoctorName(doctorName);
		}

		System.out.println("Enter Doctor Specialization : ");
		String specialization = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(specialization)) {
			doctorDetails.setSpecialization(specialization);
		}

		System.out.println("Enter Doctor Availability : ");
		String availability = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(availability)) {
			doctorDetails.setAvailability(availability);
		}

		doctorDetails.setDoctorId(Utility.doctorId());
		doctorDetails.setNumberOfPatients(0);

		jsonObject.put("Id", doctorDetails.getDoctorId());
		jsonObject.put("Name", doctorDetails.getDoctorName());
		jsonObject.put("Specialization", doctorDetails.getSpecialization());
		jsonObject.put("Availability", doctorDetails.getAvailability());
		jsonObject.put("Patients", doctorDetails.getNumberOfPatients());

		jsonArray.add(jsonObject);

		System.out.println(jsonArray);
		CliniqueRepository.writeData(doctor, jsonArray);

	}

	/**
	 * Define function readDoctorData(). Reads doctor's data from json file
	 * 
	 * @param key
	 *            --> String
	 * @param value
	 *            --> String
	 * @param choice
	 *            -->String
	 * @return void
	 */
	@Override
	public void readDoctorData(String key, String value, String choice) {
		jsonArray = (JSONArray) CliniqueRepository.readData(doctor);
		// iterator to iterate json data
		Iterator iterator = jsonArray.iterator();
		// json objects top store json data from array
		JSONObject jsonObject, lastJasonObject = null;

		// iterates over json array
		while (iterator.hasNext()) {
			// checks if data given by user matches with any json object
			// and if present prints it
			if ((jsonObject = (JSONObject) iterator.next()).get(key).equals(value)) {
				lastJasonObject = jsonObject;
				System.out.println("\nDoctor Information :");
				System.out.println("ID: " + jsonObject.get("Id") + "\t");
				System.out.println("Name: " + jsonObject.get("Name") + "\t");
				System.out.println("Specialization: " + jsonObject.get("Specialization") + "\t");
				System.out.println("Availability: " + jsonObject.get("Availability") + "\t");
				System.out.println("Number of Patients: " + jsonObject.get("Patients") + "\n");

				// asks user if want to take an appointment
				System.out.println("Do you want to take an appointment?[y/n] ");
				String response = Utility.inputString().toLowerCase();
				if (response.equals("y")) {
					makeAppointment(lastJasonObject);
				} else {
					CliniqueController.menu();
				}
			} /**
				 * String doctorName; Define static function readDoctorData(). Reads doctor's
				 * data from json file
				 * 
				 * @param key
				 *            --> String
				 * @param value
				 *            --> String
				 * @param choice
				 *            -->String
				 * @return void
				 */
		}
		System.out.println("Enter valid Doctor : " + key);
		CliniqueController.doctorChoice(choice);
	}

	/**
	 * Define function makeAppointment()
	 * 
	 * @param JSONObjcet
	 *            -> doctorJsonObject
	 * @return void
	 */
	@SuppressWarnings("unchecked")
	private void makeAppointment(JSONObject doctorJsonObject) {
		String patientId = "";
		String doctorId = (String) doctorJsonObject.get("Id");
		long patients = (long) doctorJsonObject.get("Patients");
		if (patients >= 5) { // doctor is busy
			System.out.println("Sorry!!! Doctor is busy today. Do you want to take an appointment tomorrow[y/n]");
			LocalDate today = LocalDate.now();

			// adding one day to the localdate
			LocalDate tomorrow = today.plusDays(1);
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String date = tomorrow.format(format);

			String response = Utility.inputString().toString();
			if (response.equals("y")) {
				int count = 0;
				patientId = Utility.patientId();
				patientDetailsNew(patientId, doctorId);
				appointment(patientId, doctorId, date);

			} else {
				CliniqueController.menu();
			}
		}
		// doctor is not busy. Increases number of patients and updates json file
		else {
			// will give us the current time and date
			LocalDateTime current = LocalDateTime.now();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

			String date = current.format(format);

			patientId = Utility.patientId();
			// updates patient json file
			patientDetailsNew(patientId, doctorId);
			doctorJsonObject.put("Patients", patients + 1);
			updateDoctorData(doctorJsonObject);
			appointment(patientId, doctorId, date);
			System.out.println("Congratulation You got an appointment. Your Patient ID is " + patientId + "\n");
			CliniqueController.menu();
		}
	}

	/**
	 * Define function appointment()
	 * 
	 * @param patientId
	 *            --> String
	 * @param doctorId
	 *            --> String
	 * @param date
	 *            -->String
	 * @return void
	 */

	@SuppressWarnings("unchecked")
	private void appointment(String patientId, String doctorId, String date) {
		JSONArray jsonArray = CliniqueRepository.readData(appointment);
		JSONObject jsonObject = new JSONObject();

		jsonObject.put("DoctorId", doctorId);
		jsonObject.put("PatientId", patientId);
		jsonObject.put("AppointmentDate", date);

		jsonArray.add(jsonObject);

		CliniqueRepository.writeData(appointment, jsonArray);
		System.out.println(
				"Congratulation You got an appointment on " + date + ". Your Patient ID is " + patientId + "\n");
		CliniqueController.menu();

	}

	private void updateDoctorData(JSONObject doctorJsonObject) {

		jsonArray = CliniqueRepository.readData(doctor);

		JSONArray updatedArray = new JSONArray(); // new array with updated elements
		Iterator iterator = jsonArray.iterator();
		while (iterator.hasNext()) {
			JSONObject object = (JSONObject) iterator.next();
			if (object.get("Id").equals(doctorJsonObject.get("Id"))) {
				updatedArray.add(doctorJsonObject);
			} else {
				updatedArray.add(object);
			}
		}

		CliniqueRepository.writeData(doctor, updatedArray);

	}

	/**
	 * Define function patientDetailsNew()
	 * 
	 * @param patientId
	 *            --> String
	 * @param doctorId
	 *            --> String
	 * @return void
	 */
	@SuppressWarnings("unchecked")
	public void patientDetailsNew(String patientId, String doctorId) {

		JSONArray jsonArray = CliniqueRepository.readData(patient);

		Patients patientDetails = new Patients();
		System.out.println("Enter Patient Name : ");
		String patientName = Utility.inputString();
		if (Utility.isStringOnlyAlphabet(patientName)) {
			patientDetails.setPatientName(patientName);
		}

		System.out.println("Enter Mobile Number : ");
		String mobile = Utility.inputString();

		if (Utility.mobileNumberValidator(mobile)) {
			System.out.println("Mobile :" + mobile);
			patientDetails.setMobile(Long.parseLong(mobile));
		}

		System.out.println("Enter Age : ");
		int age = Utility.inputInteger();
		patientDetails.setAge(age);
		patientDetails.setId(patientId);

		jsonObject.put("Id", patientDetails.getId());
		jsonObject.put("Name", patientDetails.getPatientName());
		jsonObject.put("Mobile", patientDetails.getMobile());
		jsonObject.put("Age", patientDetails.getAge());
		jsonObject.put("Doctor Id", doctorId);

		jsonArray.add(jsonObject);
		CliniqueRepository.writeData(patient, jsonArray);
	}

	/**
	 * Define function readPatientData()
	 * 
	 * @param key
	 *            --> String
	 * @param value
	 *            --> String
	 * @return void
	 */
	@Override
	public void readPatientData(String key, String value) {
		jsonArray = CliniqueRepository.readData(patient);
		Iterator iterator = jsonArray.iterator();
		JSONObject jsonObject;
		while (iterator.hasNext()) {
			if ((jsonObject = (JSONObject) iterator.next()).containsValue(value)) {
				System.out.println("\nPatient Information :");
				System.out.println("ID: " + jsonObject.get("Id") + "\t");
				System.out.println("Name: " + jsonObject.get("Name") + "\t");
				System.out.println("Mobile Number: " + jsonObject.get("Mobile") + "\t");
				System.out.println("Age: " + jsonObject.get("Age") + "\n");
			}
		}
		CliniqueController.menu();
	}
}