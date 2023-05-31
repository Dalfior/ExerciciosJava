package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAumento {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, novoSalario, aumento;
		int porcentagem;
		
		System.out.println("Digite o salário da pessoa: ");
		salario = sc.nextDouble();
		
		
		if (salario <= 1000.00) {
			
			aumento = (salario * 20) / 100;
			novoSalario = salario + aumento;
			
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento: R$ %.2f%n", aumento);
			System.out.println("Porcentagem = 20 %");
		}
		
		else if (salario > 1000.00 && salario <= 3000.00) {
			
			aumento = (salario * 15) / 100;
			novoSalario = salario + aumento;
			
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento: R$ %.2f%n", aumento);
			System.out.println("Porcentagem = 15 %");
		}
		
		else if (salario > 3000.00 && salario <= 8000.00) {
			
			aumento = (salario * 10) / 100;
			novoSalario = salario + aumento;
			
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento: R$ %.2f%n", aumento);
			System.out.println("Porcentagem = 10 %");
		}
		
		else {
			
			aumento = (salario * 5) / 100;
			novoSalario = salario + aumento;
			
			System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
			System.out.printf("Aumento: R$ %.2f%n", aumento);
			System.out.println("Porcentagem = 5 %");
		}
		
		
		
		sc.close();
	}

}
