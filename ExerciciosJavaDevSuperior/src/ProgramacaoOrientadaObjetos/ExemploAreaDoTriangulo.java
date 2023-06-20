package ProgramacaoOrientadaObjetos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploAreaDoTriangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, x3, y1, y2, y3, areaX, areaY, pX, pY;
		
		System.out.println("Entere the measures of triangle X: ");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		
		System.out.println("Entere the measures of triangle Y: ");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		pX = (x1 + x2 + x3) / 2;
		pY = (y1 + y2 + y3) / 2;
		
		areaX = Math.sqrt(pX * (pX - x1) * (pX - x2) * (pX - x3));
		areaY = Math.sqrt(pY * (pY - y1) * (pY - y2) * (pY - y3));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		

		sc.close();
	}

}
