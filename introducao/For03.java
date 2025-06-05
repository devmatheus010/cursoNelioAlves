package introducao;

import java.util.Scanner;

public class For03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Número: ");
		int n = sc.nextInt();
		int fat = 1;
		
		for (int i = 1; i <=n; i++) {
			fat *= i;
			
		}
		
		System.out.printf("O fatorial de %d é: %d\n ", n, fat);
	}
}
