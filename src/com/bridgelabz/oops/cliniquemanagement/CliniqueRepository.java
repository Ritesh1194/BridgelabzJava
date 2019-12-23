package com.bridgelabz.oops.cliniquemanagement;

/** *****************************************************************************
 *11. his programme is used to manage a list of Doctors associated with the Clinique. 
 * 	This also manages the list of patients who use the clinique. 
 *	It manages Doctors by Name, Id, Specialization and Availability (AM,  PM or both).
 * 	It manages Patients by Name, ID, Mobile Number and Age. The Program allows users to search Doctor by name, id, Specialization or Availability.
 *  Also the programs allows users to search patient by name, mobile number or id. 
 *  The programs allows patients to take appointment with the doctor. A doctor at  any availability time can see only 5 patients.
 *  If exceeded the user can take appointment for patient at different date or availability time.
 *  Print the Doctor Patient Report. Also show which Specialization is popular in the Clinique as well as which Doctor is popular. 
 *  For .NET Engineers use the following

 *  @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  02-12-2019
 *
 ***************************************************************************** */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class CliniqueRepository {

	/*
	 * METHOD TO WRITE DATA
	 */
	public static void writeData(String filePath, JSONArray jsonArray) {
		try (FileWriter fileWriter = new FileWriter(filePath)) {
			fileWriter.write(jsonArray.toJSONString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * METHOD TO READ DATA
	 */
	public static JSONArray readData(String filePath) {
		JSONArray jsonArray;
		try (FileReader fileReader = new FileReader(filePath)) {
			JSONParser jsonParser = new JSONParser();
			jsonArray = (JSONArray) jsonParser.parse(fileReader);
			return jsonArray;
		} catch (Exception e) {
//			e.printStackTrace();
		}
		return null;
	}
}