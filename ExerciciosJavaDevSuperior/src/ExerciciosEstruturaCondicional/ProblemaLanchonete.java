package ExerciciosEstruturaCondicional;

import java.security.DrbgParameters.NextBytes;
import java.util.Locale;
import java.util.Scanner;

public class ProblemaLanchonete {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int produto, quantidade;
		double valor = 0, total;
		
		System.out.println("Codigo do produto comprado: ");
		produto = sc.nextInt();
		
		System.out.println("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		switch (produto) {
		case 1:
			valor = 5.00;
			break;
			
		case 2:
			valor = 3.50;
			break;
			
		case 3:
			valor = 4.80;
			break;
			
		case 4:
			valor = 8.90;
			break;
			
		case 5:
			valor = 7.32;
			break;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor*quantidade);
		
		sc.close();
	}

}
