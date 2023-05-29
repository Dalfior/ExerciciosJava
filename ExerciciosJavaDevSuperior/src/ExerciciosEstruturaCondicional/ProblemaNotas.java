package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNotas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double primeiroSemestre, segundoSemestre;
				
		System.out.println("Digite a primeira nota: ");
		primeiroSemestre = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		segundoSemestre = sc.nextDouble();
		
		double notaFinal = primeiroSemestre + segundoSemestre;
		
		if (notaFinal >= 60 ) {
			System.out.printf("NOTA FINAL: %.1f%n", notaFinal);
			System.out.println("APROVADO");
		}
		else {
			System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
			System.out.println("REPROVADO");
		}
		
		
		
		sc.close();
	}

}
