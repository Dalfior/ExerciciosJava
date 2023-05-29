package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaTroco {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoUnitario, quantidade, dinheiro;
		
		System.out.println("Preço unitário do produto: ");
		precoUnitario = sc.nextDouble();
		System.out.println("Quantidade comparda: ");
		quantidade = sc.nextDouble();
		System.out.println("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		double troco = dinheiro - (precoUnitario * quantidade);
		
		System.out.printf("TROCO = $ %.2f%n", troco);
		
	}

}
