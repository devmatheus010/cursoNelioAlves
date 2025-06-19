package arrays;

import java.util.Scanner;

public class vetor08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int elementos, somaPares = 0, npares = 0;
		double media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		elementos = sc.nextInt();
		
		int[] vetor = new int[elementos];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				somaPares += vetor[i];
				npares++;
			}
		}
		if(npares == 0) {
			System.out.println("NENHUM PAR");
		
		}else {
			media = (double)somaPares/npares;
			
			System.out.println("MEDIA DOS PARES: " + media);
		}
		
		sc.close();
		
	}
}
