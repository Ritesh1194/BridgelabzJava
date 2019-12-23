package com.bridgelabz.jdbc.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcDAO {
	static Scanner sc = new Scanner(System.in);

	public static void display() {
		Connection connection = JDBCConnection.dbConnection();

		System.out.println("Enter Your Email : ");
		String userName = sc.next();

		System.out.println("Enter Your Password : ");
		String password = sc.next();

		try {
			PreparedStatement ps = (PreparedStatement) connection
					.prepareStatement("select * from employee where email=? and password = ?");
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("Login Succesfully Welocome  : " + rs.getString(2));
			} else {
				System.out.println("Invalid ");
			}
		} catch (Exception e) {
		}
	}
}
