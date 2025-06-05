package introducao;

import java.util.Scanner;

public class Cond01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int num = sc.nextInt();
		
		if (num % 2 != 0) {
			System.out.printf("O número %d é impar", num);
		}
		else {
			System.out.printf("O número %d é par", num);
		}
		sc.close();
	}

}
