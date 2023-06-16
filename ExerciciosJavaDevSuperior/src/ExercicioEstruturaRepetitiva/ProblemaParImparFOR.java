package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaParImparFOR {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, repeticao;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.print("Digite um número: ");
			repeticao = sc.nextInt();
			
			if(repeticao % 2 == 0 && repeticao > 0) {
				System.out.println("PAR POSITIVO");
			}
			
			else if(repeticao % 2 == 0 && repeticao < 0) {
				System.out.println("PAR NEGATIVO");
			}
			
			else if(repeticao % 2 != 0 && repeticao > 0) {
				System.out.println("IMPAR POSITIVO");
			}
			
			else if(repeticao % 2 != 0 && repeticao < 0) {
				System.out.println("IMPAR NEGATIVO");
			}
			
			else {
				System.out.println("NULO");
			}
			
			
		}
		
		sc.close();
	}

}
