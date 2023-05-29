package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMenor_de_tres {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double primeiro, segundo, terceiro;

		System.out.println("Pimeiro valor: ");
		primeiro = sc.nextDouble();
		System.out.println("Segundo valor: ");
		segundo = sc.nextDouble();
		System.out.println("Terceiro valor:");
		terceiro = sc.nextDouble();
		 
		if (primeiro < segundo && primeiro < terceiro) {
			
			System.out.printf("MENOR = %.4f%n", primeiro);		
		}
		
		else if (segundo < primeiro && segundo < terceiro) {
			System.out.printf("MENOR: %.4f%n", segundo);
		}
		else {
			System.out.printf("MENOR: %.4f%n", terceiro);
		}
		

		sc.close();

	}

}
