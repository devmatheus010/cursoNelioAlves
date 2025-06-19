package arrays;

import java.util.Scanner;

public class vetor06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N;
		
		System.out.println("Quantos elementos vai ter cada vetor? ");
		N = sc.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		
		System.out.println("Digite os valores de A: ");
		for(int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
			
		}
		
		System.out.println("Digite os valores de B: ");
		for(int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < N; i++) {
			 C[i] = A[i] + B[i];
			 
		}
		
		System.out.println("VALOR RESULTANTE: ");
		for(int i = 0; i < C.length; i++) {
			System.out.println(C[i]);
		}
		
		sc.close();
	}
}
