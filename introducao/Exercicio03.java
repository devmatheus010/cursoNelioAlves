package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codPeca1, numP1, codPeca2, numP2;
		double valorP1, valorP2, total;
		
		System.out.println("Codigo da peca 1: ");
		codPeca1 = sc.nextInt();
		
		System.out.println("Numero de pecas 1: ");
		numP1 = sc.nextInt();
		
		System.out.println("Valor unitário de cada peca 1: ");
		valorP1 = sc.nextDouble();
		
		System.out.println("Codigo da peca 2: ");
		codPeca2 = sc.nextInt();
		
		System.out.println("Numero de pecas 2: ");
		numP2 = sc.nextInt();
		
		System.out.println("Valor unitário de cada peca 2: ");
		valorP2 = sc.nextDouble();
		
		total = valorP1 * numP1 + valorP2 * numP2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		
		
	}

}
