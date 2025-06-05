package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class vetor03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar: ");
		int numeros = sc.nextInt();
		
		double[] vetor = new double[numeros];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
			
		}
		
		double soma = 0.0;
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
			
		}
		
		double media = soma / numeros;
		
		
		System.out.print("VALORES = ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		

		System.out.println("\nSOMA = " + soma + "\nMÉDIA = " + media);
	}
}
