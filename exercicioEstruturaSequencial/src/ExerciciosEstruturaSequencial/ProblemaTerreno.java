package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaTerreno {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float largura, comprimento, quadrado;
		
		
		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextFloat();
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextFloat();
		System.out.println("Digite o valor do metro quadrado: ");
		quadrado = sc.nextFloat();
		
		float area = largura * comprimento;
		float terreno = area * quadrado;
		
		System.out.printf("Area do terreno = %.2f%n", area);
		System.out.printf("Preco do terreno = %.2f%n", terreno);
		
		sc.close();
		
		
	}

}
