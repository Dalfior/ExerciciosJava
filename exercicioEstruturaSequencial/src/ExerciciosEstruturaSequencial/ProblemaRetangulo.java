package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaRetangulo {
	
	public static void main(String[] args) {
		//teste de commit no linux
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float base, altura;
		
		System.out.println("Base do retangulo: ");
		base = sc.nextFloat();
		System.out.println("Altura do retangulo: ");
		altura = sc.nextFloat();
		
		float area = base * altura;
		float perimetro = 2 * (base + altura) ;
		int potencia = 2;
		float raiz = (float) (Math.pow(base, potencia) + Math.pow(altura, potencia));
		float diagonal = (float) Math.sqrt(raiz);
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();
	}

}
