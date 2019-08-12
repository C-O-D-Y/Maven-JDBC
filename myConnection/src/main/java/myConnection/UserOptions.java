package myConnection;

import java.util.Scanner;

public class UserOptions {

	public static void main(String[] args) {
		while (1 > 0) {
			System.out.println("Please select below Option \n " + "1: execute selection query \n "
					+ "2: execute insertion query \n " + "3: execute deletion query \n "
					+ "4: execute Updation query \n "+ "5: Exit \n");
			Scanner scanner = new Scanner(System.in);
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				new Fetch().fetchData();
				break;

			case 2:
				new Insertion().insertData();
				break;

			case 3:
				new deletion().deleteData();
				break;
				
			case 4:
				new updation().updateData();
				break;
				
			case 5:
				System.out.println("Auf Wiedersehen");
				System.exit(0);
				
			}
		}
	}

}
