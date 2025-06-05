package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		double hotDog = 10.0;
		double xEgg= 10.0;
		double refri = 5.0;
		double batata = 8.0;
		int qtdHot, qtdXegg, qtdRefri, qtdBatata;
		double total;
		
		System.out.println("Nome do cliente: ");
		nome = sc.next();
		
		System.out.println("Quantos hotdog: ");
		qtdHot = sc.nextInt();
		
		System.out.println("Quantos X-EGG: ");
		qtdXegg = sc.nextInt();
		
		System.out.println("Quantos Refri: ");
		qtdRefri = sc.nextInt();
		
		System.out.println("Quantas batata: ");
		qtdBatata = sc.nextInt();
		
		total = (qtdHot * hotDog) + (qtdXegg * xEgg) +
				(qtdRefri * refri) + (qtdBatata * batata);
		
		System.out.printf("%s, seu pedido foi %d hot dog, %d X-EGG, %d refrigerante, %d batatas\n"
				,nome,qtdHot, qtdXegg, qtdRefri,qtdBatata);
		System.out.printf("Valor a ser pago: R$%.2f" , total);
			
		sc.close();

		
	}
}
