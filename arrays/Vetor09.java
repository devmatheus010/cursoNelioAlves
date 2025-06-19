package arrays;

import java.util.Scanner;

import entities.Pessoa02;


public class Vetor09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdPessoas, maisVelho = 0, posicao = 0;
		
		System.out.print("Quantas pessoas você vai digitar? ");
		qtdPessoas = sc.nextInt();
		
		Pessoa02[] vetPessoa;
		vetPessoa = new Pessoa02[qtdPessoas];
		
		for(int i = 0; i < vetPessoa.length; i++) {
			System.out.printf("Dados da %da pessoa:\n" , i + 1);
			
			System.out.print("Nome: ");
			vetPessoa[i] = new Pessoa02();
			vetPessoa[i].nome = sc.next();
			
			System.out.print("Idade: ");
			vetPessoa[i].idade = sc.nextInt();
		}
		
		
		
		for(int i = 0; i < qtdPessoas; i++) {
			if(maisVelho < vetPessoa[i].idade) {
				maisVelho = vetPessoa[i].idade;
				posicao = i;
			}
		
		}
		
		
		System.out.printf("PESSOA MAIS VELHA: %s, %d\n", vetPessoa[posicao].nome, vetPessoa[posicao].idade);

	}
}
