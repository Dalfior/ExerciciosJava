package curso_programacao;

import java.util.Locale;

public class ExercicioEntradaDeDados {
	
	public static void main(String[] args) {
		
		
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s whitch price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		
		System.out.printf("%d yers old, code %d and gender: %s%n%n", age, code, gender);
		
		Locale.setDefault(Locale.US);
		System.out.printf("Mesue with eicht decimal places: %.8f%n", measure);
		System.out.printf("Routed (three decima places): %.3f%n", measure);
		System.out.printf("US decimal point: %.3f%n", measure );
		
		
		
		
	}

}
