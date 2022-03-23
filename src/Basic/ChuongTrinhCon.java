package Basic;

import java.util.Scanner;

public class ChuongTrinhCon {
	private static final String VALID_PASSWORD = new String("thuongyeuthi");

	public static boolean isValidInput(String userInput) {
		if (userInput.equals(VALID_PASSWORD)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap mat khau: ");
		String pass = scan.nextLine();
		
		if(isValidInput(pass)) {
			System.out.print("Mat khau dung");
		} else {
			System.out.print("Mat khau sai");
		}
	}

}
