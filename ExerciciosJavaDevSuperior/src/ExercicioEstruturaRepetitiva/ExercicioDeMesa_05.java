package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeMesa_05 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 2, y = 10;
		
		System.out.println("Olá");
		while (x < y) {
			System.out.println(x + "-" + y);
			x = x * 2;
			y = y + 1;
		}
	}

}
