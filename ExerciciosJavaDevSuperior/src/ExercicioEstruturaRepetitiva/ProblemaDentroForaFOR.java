package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDentroForaFOR {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, numero, i = 0, contador1 = 0, contador2 = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		x = sc.nextInt();
		
		for(i=0;i<x;i++) {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			
			if(numero <= 20 && numero >= 10) {
				contador1++;
			}
			else {
				contador2++;
			}

		}
		
		System.out.printf("%d DENTRO %n", contador1);
		System.out.printf("%d FORA %n", contador2);
		
		
		
		sc.close();
	}

}
