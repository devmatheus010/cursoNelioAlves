package introducao;

import java.util.Scanner;

public class Cond02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int numA = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int numB = sc.nextInt();
		
		if (numA % numB == 0|| numB % numA == 0 ) {
			System.out.printf("Os números %d e %d são múltiplos", numA, numB);
		}
		else {
			System.out.printf("Os números %d e %d não são múltiplos", numA, numB);
		}
	}

}
