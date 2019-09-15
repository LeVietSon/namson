package Lab1;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		double dai, rong, chuVi, dienTich, canhNN;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		dai = sc.nextDouble();
		System.out.println("Nhập chiều rộng: ");
		rong = sc.nextDouble();
		chuVi = (dai + rong) * 2;
		System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
		dienTich = dai * rong;
		System.out.println("Diện tích của hình chữ nhật là: " + dienTich);
		canhNN = Math.min(dai, rong);
		System.out.println("Cạnh nhỏ nhất của hình chữ nhật là: " + canhNN);
	}

}
