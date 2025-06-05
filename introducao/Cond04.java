package introducao;

import java.util.Scanner;

public class Cond04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número de 0 a 100: ");
		double a = sc.nextDouble();

		if (a > 100 || a < 0) {
			System.out.println("Fora do intervalo: ");

		} else if (a <= 25) {
			System.out.println("Intervalo de 0 a 25");
		} else if (a <= 50) {
			System.out.println("Intervalo de 25 a 50");
		} else if (a <= 75) {
			System.out.println("Intervalo de 50 a 75");
		} else if (a <=100){
			System.out.println("Intervalo de 75 a 100");
		}
		else {
			System.out.println();
		}

	}
}
