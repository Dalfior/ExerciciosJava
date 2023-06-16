package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDivisaoFOR {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double i, n, numerador, denominador, divisao;
		
		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextDouble();
		
		for (i=0; i<n; i++) {
			System.out.print("Entre com o numerador: ");
			numerador = sc.nextDouble();
			System.out.print("Entre com o denominador: ");
			denominador = sc.nextDouble();
			
			if(denominador != 0) {
				divisao = numerador / denominador;
				System.out.println("DIVISÃO = " + divisao);
			}
			else {
				System.out.println("DIVISÃO IMPOSSÍVEL");
			}
			
			
		}
		
		
		
		sc.close();
	}

}
