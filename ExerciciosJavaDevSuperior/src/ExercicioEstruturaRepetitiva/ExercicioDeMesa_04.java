package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeMesa_04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int x = 0;
		while(x < 5) {
			int y = x * 3;
			System.out.println(y);
			x = x + 1;
		}
		
		System.out.println("Fim");
		
		
		
		
		

		sc.close();

	}

}
