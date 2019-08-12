package myConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Insertion {
	public void insertData() {
		try {
			Connection con = new LoadDriver().loadingDriver();
			PreparedStatement pstmt = null;
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date1 = new Date(500);
			Scanner scanner = new Scanner(System.in);
			String sql = ("INSERT INTO actor VALUES (?,?,?,?)");
			pstmt = con.prepareStatement(sql);
			System.out.println("Please enter the actor id");
			int id = scanner.nextInt();
			pstmt.setInt(1, id);
			scanner.nextLine();
			System.out.println("Please enter the First_name of the actor");
			String firstName = scanner.nextLine();
			pstmt.setString(2, firstName);
			System.out.println("Please enter the Last_name of the actor");
			String lastName = scanner.nextLine();
			pstmt.setString(3, lastName);
			String date = (formatter.format(date1));
			pstmt.setString(4, date);
			System.out.println("Data inserted");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
