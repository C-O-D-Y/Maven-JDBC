package myConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class updation {

	public void updateData() {
		try {
			Scanner scanner = new Scanner(System.in);
			Connection con = new LoadDriver().loadingDriver();
			String sql = "update actor set first_name=? where actor_id=?";
			System.out.println("Please enter the id of the actor");
			int id=scanner.nextInt();
			PreparedStatement stmt = con.prepareStatement(sql);
			      stmt.setString(2, "Ellenson");
			      stmt.setInt(1, id);
			      stmt.executeUpdate();
			System.out.println("Data Updated");
			con.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
