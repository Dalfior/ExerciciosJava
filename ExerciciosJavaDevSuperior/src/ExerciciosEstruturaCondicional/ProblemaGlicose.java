package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaGlicose {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double medida;
		
		System.out.println("Digite a medida da glicose: ");
		medida = sc.nextDouble();
		
		if(medida <= 100) {
			System.out.println("Classificação: normal.");
		}
		else if(medida > 100 && medida <= 140) {
			System.out.println("Classificação: elevado.");
		}
		else {
			System.out.println("Classificação: diabetes.");
		}
		
		
		
		sc.close();
		
	}

}
