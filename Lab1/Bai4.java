package Lab1;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		double a, b, c, delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a: ");
		a = sc.nextDouble();
		System.out.println("Nhập b: ");
		b = sc.nextDouble();
		System.out.println("Nhập c: ");
		c = sc.nextDouble();
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("Căn bậc hai của delta là" + Math.sqrt(delta));
	}

}
