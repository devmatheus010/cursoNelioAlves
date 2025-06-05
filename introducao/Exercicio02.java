package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valorH,horas, salario;
		int num;
		
		System.out.println("Digite o número do funcionário: ");
		num = sc.nextInt();
		
		System.out.println("Horas trabalhadas: ");
		horas = sc.nextDouble();
		
		System.out.println("Valor Hora: ");
		valorH = sc.nextDouble();
		
		salario = valorH * horas;
		
		System.out.printf("O número do funcionario é %d e o salario é R$ %.2f", num, salario);
		
	}
}
