package entities;

public class CurrencyConverter {
	
	public static double DOLAR;
	public static double VALOR;
	public static double IOF = 6;
	
	public static double valorTotal() {
		double iof = (DOLAR * VALOR) * IOF / 100;
		return DOLAR * VALOR + iof;
	}
	

}
