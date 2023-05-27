package CursoDevSuperior;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaCirculo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;
		
		System.out.println("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		System.out.printf("AREA = %.3f%n", area);
		
		sc.close();
	}

}
