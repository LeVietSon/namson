package Lab1;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		double a,theTich ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều dài cạnh a: ");
		a = sc.nextDouble();
		theTich = Math.pow(a, 3);
		System.out.println("Thể tích của khối lập phương: "+ theTich);
	}

}
