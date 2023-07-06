package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class ProgramCurrencyConverter {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Qual o valor do dólar? ");
	CurrencyConverter.DOLAR = sc.nextDouble();
	System.out.print("Quantos dólares serão comprador? ");
	CurrencyConverter.VALOR = sc.nextDouble();
	System.out.printf("Valor a ser pago em reais = R$ %.2f%n", CurrencyConverter.valorTotal());
	
	
	
	
	
	
	sc.close();
	}
}
