package Lab3;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		double N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên: ");
		N = sc.nextDouble();

		boolean ok = true;
		for (int i = 2; i < N - 1; i++) {
			if (N % i == 0) {
				ok = false;
				break;
			}
			i++;
		}
		if (ok == true)
			System.out.print("Số vừa nhập là số nguyên tố");
		else
			System.out.print("Số vừa nhập không phải là số nguyên tố");
	}
}
