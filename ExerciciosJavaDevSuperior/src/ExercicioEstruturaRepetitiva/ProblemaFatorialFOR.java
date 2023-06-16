package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaFatorialFOR {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, soma = 1;
		
		System.out.print("Digite o valor de N: ");
		n = sc.nextInt();
		
		for(i=n; i>0; i--) {
			soma *= i;
		}
		System.out.print("FATORIAL = " + soma);
		
		
		sc.close();
	}

}
