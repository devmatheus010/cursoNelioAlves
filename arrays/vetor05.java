package arrays;

import java.util.Scanner;

public class vetor05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int posicao = 0, quantidade;
		double maior;
		
		System.out.println("Quantos números você vai digitar?");
		quantidade = sc.nextInt();
		
		double[] numerosDigitados = new double[quantidade];
		
		
		for(int i = 0; i < numerosDigitados.length; i++) {
			System.out.println("Digite um número: ");
			numerosDigitados[i] = sc.nextDouble();
		}
		
		maior = numerosDigitados[0];
		
		
		for(int i = 0; i < numerosDigitados.length; i++) {
			if(numerosDigitados[i] > maior) {
				maior = numerosDigitados[i];
				posicao = i;
			}
		}
	
		
		System.out.println("Maior número: " + maior);
		System.out.println("Posição: " + posicao);
	}
}
