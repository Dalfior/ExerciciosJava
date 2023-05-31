package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDardo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double d1, d2, d3;
		
		System.out.println("Digite as três distâncias: ");
		d1 = sc.nextDouble();
		d2 = sc.nextDouble();
		d3 = sc.nextDouble();
		
		if (d1 > d2 && d1 > d3) {
			System.out.printf("MAIOR DISTANCIA: %.2f%n", d1);
		}
		else if (d2 > d1 && d2 > d3) {
			System.out.printf("MAIOR DISTANCIA: %.2f%n", d2);
		}
		else {
			System.out.printf("MAIOR DISTANCIA: %.2f%n", d3);
		}
		
		sc.close();
	}

}
