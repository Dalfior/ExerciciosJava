package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaCrescente_P1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite dois números: ");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();		
		
		while (numero1 != numero2) {
			
			System.out.println("Digite outros dois números: ");
			numero1 = sc.nextInt();
			numero2 = sc.nextInt();			
			
			
			if(numero1 > numero2) {
				System.out.println("DE5CRESCENTE!");
				continue;
			}
			
			else if(numero2 > numero1) {
				System.out.println("CRESCENTE!");
				continue;
			}
			else {
				break;
			}
		}
		
		System.out.println("Fim do programa.");
		
		
		
		
		sc.close();
		
		
	}

}
