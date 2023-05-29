package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaOperadora {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double minutos;
	//double excedente = 2.00;
	double valor = 50.00;
	
	System.out.println("Digite a quantidade de minutos: ");
	minutos = sc.nextDouble();
		
	if (minutos > 100) {
		minutos -= 100;
		double excedente = (minutos * 2) + valor;
		System.out.printf("Valor a pagar: R$ %.2f%n", excedente);
	}
	else {
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		
	}
	
	
	
	
	
	sc.close();
	}
}
