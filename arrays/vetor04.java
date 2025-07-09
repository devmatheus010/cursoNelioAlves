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
		
		Pessoa[] pessoas = new Pessoa[qtdPessoas];
		
		
		for(int i = 0; i < pessoas.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n", i + 1);

			System.out.print("Nome: ");
			nomePessoa = sc.nextLine();
			
			System.out.print("Idade: ");
			idadePessoa = sc.nextInt();
			
			System.out.print("Altura: ");
			alturaPessoa = sc.nextDouble();
			
			pessoas[i] = new Pessoa(nomePessoa, idadePessoa, alturaPessoa);
		}
		
		double soma = 0.0;
		
		
		for(int i = 0; i < pessoas.length; i++) {
			soma += pessoas[i].getAltura();
		}
		
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() < 16) {
				menores++;
				System.out.println();
				System.out.println(pessoas[i].getNome());
				
			}
		}
		
		double media = soma / qtdPessoas;
		double porcentagem = menores * 100 / qtdPessoas;
		
		System.out.println();
		System.out.printf("Altura média: %.2f " , media);
		System.out.printf("\nQuantidade de menores: %d " , menores);
		System.out.printf("\nPorcentagem de menores: %.2f " , porcentagem);
		
	
		 
	}
}
