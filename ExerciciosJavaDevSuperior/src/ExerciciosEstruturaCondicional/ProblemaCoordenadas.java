package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaCoordenadas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y, q1, q2, q3, q4, origem, eixoX, eixoY;
		
		System.out.println("Valor de X: ");
		x = sc.nextDouble();
		System.out.println("Valor de Y: ");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if(x != 0 && y == 0) {
			System.out.println("Eixo X");
		}
		else if(x == 0 && y != 0) {
			System.out.println("Eixo Y");
		}
		else if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();
	}

}
