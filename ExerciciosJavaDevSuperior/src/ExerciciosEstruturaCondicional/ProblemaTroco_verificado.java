package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaTroco_verificado {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double produto, dinheiro;
		int quantidade;
		
		System.out.println("Preço unitáio do produto: ");
		produto = sc.nextDouble();
		System.out.println("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.println("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		
		double total = produto * quantidade;
		double troco;
		
		if (dinheiro >= total) {
			troco = dinheiro - total;
			System.out.printf("TROCO: R$ %.2f%n", troco);
		}
		else {
			troco = total - dinheiro;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$ %.2f%n", troco);
			
		}
		
		sc.close();
	
	}

}
