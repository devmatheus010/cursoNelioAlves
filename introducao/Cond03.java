package introducao;

import java.util.Scanner;

public class Cond03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A hora que o jogo iniciou: ");
		double inicio = sc.nextDouble();
		System.out.println("Hora que o jogo encerrou: ");
		double fim = sc.nextDouble();
		double duracao;
		
		if(inicio < fim) {
			duracao = fim - inicio;
		
		}
		else {
			duracao = 24 - inicio - fim;
		}
		System.out.println("O jogo durou " + duracao + " horas");

	}
}