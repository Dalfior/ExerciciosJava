package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMultiplos {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite dois números inteiros: ");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if(numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("São multiplos.");
		}
		
		else {
			System.out.println("Não são multiplos.");
		}
		
		sc.close();
	}

}
