package CursoDevSuperior;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMedidas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, quadrado, triangulo, tapezio;
		
		System.out.println("Digite a medida A: ");
		a = sc.nextDouble();
		System.out.println("Digite a medida B: ");
		b = sc.nextDouble();
		System.out.println("Digite a medida C: ");
		c = sc.nextDouble();
		
		double areaQuadrado = Math.pow(a, 2);
		double areaTriangulo = (a * b) / 2;
		double areaTrapezio = ((a + b) * c) / 2;
		
		System.out.printf("AREA DO QUADRADO = %.4f%n", areaQuadrado);
		System.out.printf("AREA DO TRIANGULO = %.4f%n", areaTriangulo);
		System.out.printf("AREA DO TRAPEZIO = %.4f%n", areaTrapezio);
		
		
		
		
		
		sc.close();
		
		
		
		
	}

}
