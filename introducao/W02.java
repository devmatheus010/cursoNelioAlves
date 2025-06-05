package introducao;
import java.util.Scanner;

public class W02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira seu nome: ");
		String nome = sc.nextLine();
		System.out.printf("Olá, %S.Escolha um tipo de combustível.\n" +
		"1.Álcool\n" + 
		"2.Gasolina\n"+
		"3.Diesel\n"+
		"4.Fim\n", nome);
		
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool++;
			}
			else if (tipo == 2) {
				gasolina++;
			}
			else if (tipo == 3) {
				diesel++;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}