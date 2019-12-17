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

public class TestFacadedesignPattern {

	public static void main(String[] args) {
		String tableName = "Employee";

		Connection con = MysqlHelper.getMySqlDBConnection();
		MysqlHelper mySqlHelper = new MysqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);

		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);

		HelperFacadeDesignPattern.generateReport(HelperFacadeDesignPattern.DBTypes.MYSQL,
				HelperFacadeDesignPattern.ReportTypes.HTML, tableName);
		HelperFacadeDesignPattern.generateReport(HelperFacadeDesignPattern.DBTypes.ORACLE,
				HelperFacadeDesignPattern.ReportTypes.PDF, tableName);
	}
}