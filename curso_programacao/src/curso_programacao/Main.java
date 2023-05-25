package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		int y = 32;
		double x = 10.35784;
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.err.println("RESULTADO = " + x + " METROS");
		System.err.printf("RESULTADO = $.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		System.out.println(y);
		System.out.println("Bom dia!");
	}

}
