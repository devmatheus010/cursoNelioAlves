package arrays;

import java.util.Locale;
import java.util.Scanner;

public class vetor07 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media,  soma = 0.0;
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		media = soma / n;
		
		System.out.printf("\nMÉDIA DO VETOR = %.3f\n" , media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}
		
		
	}
}
