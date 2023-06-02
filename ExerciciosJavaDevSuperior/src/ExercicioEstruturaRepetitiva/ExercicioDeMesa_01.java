package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeMesa_01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 5, y = 0;
		
		while(x > 2) {
			System.out.println("X = " + x);
			System.out.println("Y = " + y);
			y += x;
			x -= 1;
		}
		
		
		
		
		
		sc.close();
	}

}
