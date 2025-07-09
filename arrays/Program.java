package arrays;

import java.util.Scanner;

import entities.Rent;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented: ");
		int rooms = sc.nextInt();
		
		Rent[] vect = new Rent[11];
		
		for(int i = 1; i <= rooms; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Rent(nome, email);

		}
		
		System.out.println("Busy rooms:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.print(i + ":" + vect[i]);
			}
		}
	}
}
