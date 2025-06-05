package arrays;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class vetor04 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomePessoa;
		int idadePessoa;
		double alturaPessoa;
		int menores = 0;
		
		System.out.println("Quantas pessoas serao digitas? ");
		int qtdPessoas = sc.nextInt();
		
		Pessoa[] vetor = new Pessoa[qtdPessoas];
		
		
		for(int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n", i + 1);

			System.out.print("Nome: ");
			nomePessoa = sc.nextLine();
			
			System.out.print("Idade: ");
			idadePessoa = sc.nextInt();
			
			System.out.print("Altura: ");
			alturaPessoa = sc.nextDouble();
			
			vetor[i] = new Pessoa(nomePessoa, idadePessoa, alturaPessoa);
		}
		
		double soma = 0.0;
		
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getAltura();
		}
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].getIdade() < 16) {
				menores++;
				System.out.printf("Nome dos menores: %s\n " ,vetor[i].getNome());
				
			}
		}
		
		double media = soma / qtdPessoas;
		double porcentagem = menores * 100 / qtdPessoas;
		
		System.out.printf("Altura média: %.2f " , media);
		System.out.printf("\nQuantidade de menores: %d " , menores);
		System.out.printf("\nPorcentagem de menores: %.2f " , porcentagem);
		
		

		
		
		 
	}
}
