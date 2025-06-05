package arrays;

import java.util.Scanner;

public class vetor02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar: ");
		int quantidade = sc.nextInt();

		int[] vetor = new int[quantidade];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();

		}

		System.out.println("NÚMEROS NEGATIVOS:\n");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}

		sc.close();
	}

}
