package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaParesConsecutivos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, incremento = 0, soma = 0;

		System.out.print("Digite um número inteiro: ");
		x = sc.nextInt();

		while (incremento < 5 && x > 0) {
			incremento++;

			if (x % 2 == 0) {				
				soma = ((x * 5) + 20);



			}
			else if(x % 2 != 0) {
				soma = (((x + 1) * 5) + 20);

			}
		
			
			
			System.out.println("SOMA " + soma);
			
			System.out.print("Digite um número inteiro: ");
			x = sc.nextInt();


		}

		sc.close();
	}

}
