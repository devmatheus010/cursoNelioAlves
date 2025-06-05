package introducao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, d, diferenca;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		
		diferenca = (a * b - c * d);
		System.out.println(diferenca);
		
	}

}
