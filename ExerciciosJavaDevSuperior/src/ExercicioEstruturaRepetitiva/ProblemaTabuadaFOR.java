package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaTabuadaFOR {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor, calculo, i;
		
		System.out.println("Deseja a tabuada para qual valor: ");
		valor = sc.nextInt();
		
		for(i=0; i<10; i++) {
			
			calculo = valor * i;
			System.out.printf("%d X %d = %d%n", valor, i, calculo);
		}
		
		
		
		
		
		sc.close();
	}

}
