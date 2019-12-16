package com.bridgelabz.designpatternprogram.facadedesignpattern;
/**
 * *****************************************************************************
 * 	2. Structural Design Patterns
 *	2 . Facade design pattern is used to help client applications to easily interact with the system.
 * In the Address Book Problem use Facade Pattern to read the Address Book from the File or from the Database
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 07-12-2019
 *
 */
import java.sql.Connection;

public class MySqlHelper {

	public static Connection getMySqlDBConnection(){
	
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con){
	
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con){
		
	}
}