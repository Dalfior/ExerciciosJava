package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RetanguloPOO;

public class ProgramPOORetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RetanguloPOO retangulo = new RetanguloPOO();
		
		System.out.println("Entre com a largura e altura do retângulo: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.println(retangulo);
		//System.out.println("AREA = " + retangulo.area());
		//System.out.println("PERIMETRO = " + retangulo.perimeter());
		//System.out.println("DIAGONAL = " + retangulo.diagonal());
		
		
		
		
		
		
		
		

		sc.close();
	}
}
