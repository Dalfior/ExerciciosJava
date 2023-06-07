package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaCombustivel {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = 0, alcool = 0, gasolina = 0, diesel = 0;
		
		while(codigo != 4) {
			
			System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
			
			switch(codigo){
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}

		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool %d%n", alcool);
		System.out.printf("Gasolina %d%n", gasolina);
		System.out.printf("Diesel %d%n", diesel);	
		
		
		sc.close();
	}

}
