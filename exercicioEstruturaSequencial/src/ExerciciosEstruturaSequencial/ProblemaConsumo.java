package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaConsumo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distancia, combustivel;
		
		System.out.println("Distancia percorrida: ");
		distancia = sc.nextDouble();
		System.out.println("Combustível gasto: ");
		combustivel = sc.nextDouble();
		
		double consumoMedio = distancia / combustivel;
		
		System.out.printf("Consumo médio: %.3f%n", consumoMedio);
		
		
	}

}
