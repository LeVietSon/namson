package Lab1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		String hoTen;
		double diem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.println("Nhập điểm: ");
		diem = sc.nextDouble();
		System.out.println(hoTen + " " + diem + " điểm");
	}

}
