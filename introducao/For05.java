package introducao;

import java.util.Scanner;

public class For05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um N inteiro: ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (n % 2 == 0) {
				System.out.print(n);
				
			}
			for (int j = 0; j <=n; j++) {
				if(j % 2 !=0) {
					System.out.println(j);
				}
			
			
			}
		}
	}
}
