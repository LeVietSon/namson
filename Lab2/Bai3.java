package Lab2;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		double soDien;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số điện: ");
		soDien = sc.nextDouble();
		if (soDien < 50) {
			System.out.println("Tiền điện phải trả là: " + soDien * 1000);
		} else {
			System.out.println("Tiền điện phải trả là: " + soDien * 1200);
		}
	}
}
