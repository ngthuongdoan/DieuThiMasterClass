package Basic;

import java.util.Scanner;

public class VongLapWhile {
	public static void main(String args[]) {
		int n = 10;
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		Scanner scan = new Scanner(System.in);
		int randNumber;

		do {
			System.out.print("Nhap n: ");
			randNumber = scan.nextInt();
			if (randNumber != 10) {
				System.out.println("Nhap lai con cho");
			}
		} while (randNumber != 10);

		System.out.print("Ket thuc chuong trinh");
		

		while(randNumber != 10) {
			System.out.print("Nhap n: ");
			randNumber = scan.nextInt();
			if (randNumber != 10) {
				System.out.println("Nhap lai con cho");
			}
		}

		System.out.print("Ket thuc chuong trinh");
	}
}
