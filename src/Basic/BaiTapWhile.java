package Basic;

import java.util.Scanner;

public class BaiTapWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình tìm một số nguyên a trong mảng arr cho trước.
		// a được nhập vào từ bàn phím. Xuất ra màn hình vị trí của a trong
		// mảng nếu tìm thấy, ngược lại là “khong tim thay”.

		int[] arr = { 1, 43, 12, 6, 3, 71, 30 };
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Nhap so: ");
			int tempNumber = scan.nextInt();
			
			int position = -1;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == tempNumber) {
					position = i;
					break;
				};
			}
			
			if (position != -1) {
				System.out.println("Vi tri cua " + tempNumber + ": " + position);
				break;
			} else {
				System.out.println("Khong tim thay, nhap lai!");
			}
		}

	}

}
