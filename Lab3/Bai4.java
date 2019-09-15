package Lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai4 {
	public String hoTen;
	public int diem;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số sinh viên: ");
		int n = input.nextInt();

		ArrayList<Bai4> danhSach = new ArrayList();

		for (int i = 0; i < n; i++) {
			input.nextLine();
			Bai4 x = new Bai4();
			System.out.println("Thông tin sinh viên thứ " + i);
			System.out.print("Họ và Tên: ");
			x.hoTen = input.nextLine();
			System.out.print("Điểm: ");
			x.diem = input.nextInt();
			danhSach.add(x);
		}
		for (int i = 0; i < danhSach.size(); i++) {
			System.out.println("Tên: " + danhSach.get(i).hoTen + " Điểm: " + danhSach.get(i).diem);
		}
		for (int i = 0; i < danhSach.size(); i++) {
			if (danhSach.get(i).diem < 5)
				System.out.print(danhSach.get(i).hoTen + " hoc luc yeu");
			else if (danhSach.get(i).diem < 6.5 && danhSach.get(i).diem >= 5)
				System.out.print(danhSach.get(i).hoTen + " hoc luc trung binh");
			else if (danhSach.get(i).diem < 7.5 && danhSach.get(i).diem >= 6.5)
				System.out.print(danhSach.get(i).hoTen + " hoc luc kha");
			else if (danhSach.get(i).diem < 9 && danhSach.get(i).diem >= 7.5)
				System.out.print(danhSach.get(i).hoTen + " hoc luc gioi");
			else if (danhSach.get(i).diem >= 9)
				System.out.print(danhSach.get(i).hoTen + " hoc luc xuat sac");
			else
				System.out.print("diem nhap sai !");
			System.out.println("");

		}

		// Sắp xếp danh sách theo số điểm tăng dần!
		Collections.sort(danhSach, new Comparator<Bai4>() {
			public int compare(Bai4 sv1, Bai4 sv2) {
				if (sv1.diem > sv2.diem) {
					return 1;
				} else {
					if (sv1.diem == sv2.diem) {
						return 0;
					} else {
						return -1;
					}
				}
			}
		});

		System.out.println("Danh sách sắp xếp theo thứ tự điểm tăng dần là: ");
		for (int i = 0; i < danhSach.size(); i++) {
			System.out.println("Tên: " + danhSach.get(i).hoTen + " Điểm: " + danhSach.get(i).diem);
		}
	}
}
