package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaPonderadaFOR {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n, numero1 = 0, numero2 = 0, numero3 = 0, calculo, peso1, peso2, peso3, totalPeso;
		
		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.printf("Digite %.0f números: ", n);
			//System.out.printf("Digite três números: ");
			numero1 = sc.nextDouble();
			numero2 = sc.nextDouble();
			numero3 = sc.nextDouble();
			
			peso1 = 2;
			peso2 = 3;
			peso3 = 5;
			totalPeso = peso1 + peso2 + peso3;
			calculo = ((numero1 * peso1) + (numero2 * peso2) + (numero3 * peso3)) / totalPeso; 
			System.out.printf("MEDIA = %.1f%n", calculo);
		}

		
		sc.close();
	}

}
