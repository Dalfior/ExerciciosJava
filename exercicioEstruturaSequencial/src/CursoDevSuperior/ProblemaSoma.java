package CursoDevSuperior;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSoma {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
				
		System.out.printf("Digite o valor de X: ");
		x = sc.nextDouble();
		System.out.printf("Digite o valor de Y: ");
		y = sc.nextDouble();
		
		double soma = (double )x + y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
