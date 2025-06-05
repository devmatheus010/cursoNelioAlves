package arrays;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class vetor01 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos: ");
		int quantidade = sc.nextInt();
		
		Produto[] vetor = new Produto[quantidade];
		
		for(int i=0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.println("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			
			System.out.println("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			
			vetor[i] = new Produto(nomeProduto, precoProduto);
		}
		
		double soma = 0.0;
		
		for(int i=0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double mediaDosPrecos = soma / quantidade;
		
		System.out.printf("Média de preço dos produtos comprados:R$ %.2f%n ", mediaDosPrecos);
	}
}
