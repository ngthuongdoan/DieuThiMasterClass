package Basic;

import java.util.Scanner;

public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap a: ");
		double a = scan.nextDouble();
		System.out.print("Nhap b: ");
		double b = scan.nextDouble();
		System.out.print("Nhap c: ");
		double c = scan.nextDouble();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					// 0x2 + 0x + 0 = 0;
					System.out.print("PTVSN");
				} else {
					// 0x2 + 0x + 8 = 0;
					System.out.print("PTVN");

				}
			} else {
				System.out.print("PT co nghiem duy nhat " + -c / b);
			}
		} else {
			double delta = b * b - 4 * a * c;
			if (delta > 0) {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Nghiem thu nhat x1 = " + x1);
				System.out.println("Nghiem thu hai x2 = " + x2);
			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep x1 = x2 =  " + (-b / 2 * a));
			} else {
				System.out.print("PTVN");
			}
		}
	}

}
