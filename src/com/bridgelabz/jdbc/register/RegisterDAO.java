package com.bridgelabz.jdbc.register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.bridgelabz.jdbc.login.JDBCConnection;
public class RegisterDAO {

	static Scanner sc = new Scanner(System.in);
	static Connection connection = JDBCConnection.dbConnection();

	public static void register() {

		try {
			PreparedStatement ps = (PreparedStatement) connection
					.prepareStatement("insert into Register values(?,?,?,?,?)");
			
			System.out.println("Enter Your First Name  :");
			String firstName = sc.next();
			System.out.println("Enter Your Last Name  :");
			String lastName = sc.next();
			System.out.println("Enter Your Mobile Number  :");
			int mobileNumber = sc.nextInt();
			System.out.println("Enter Your Address :");
			String address = sc.next();
			System.out.println("Enter Your Location :");
			String location = sc.next();

			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setInt(3, mobileNumber);
			ps.setString(4, address);
			ps.setString(5, location);
			int rs  = ps.executeUpdate();
			
			if (rs > 0) {
				System.out.println("User Registered Successfully : ");
			} else {
				System.out.println("Invalid Data : ");
			}
		} catch (Exception e) {
		}
	}
}