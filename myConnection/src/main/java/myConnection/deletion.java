package myConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletion {
	public void deleteData() {
		try {
			Scanner scanner = new Scanner(System.in);
			Connection con = new LoadDriver().loadingDriver();
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM actor WHERE actor_id = ?");
			System.out.println("Please enter the id of the actor to be deleted");
			int id = scanner.nextInt();
			pstmt.setInt(1, id);
			System.out.println("Data Deleted");
			con.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
