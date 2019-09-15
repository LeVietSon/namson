package Lab3;

public class Bai2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.println();
			System.out.println("Cửu chương "+i);
			for (int j = 1; j <= 10; j++) {
				System.out.print(i + " x " + j + " = " + i * j);
				System.out.println();
			}
			
		}
	}
}
