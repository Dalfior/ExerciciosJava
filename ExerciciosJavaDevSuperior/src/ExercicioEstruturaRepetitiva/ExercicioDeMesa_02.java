package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeMesa_02 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 2, y = 0;
		
		while(x < 60) {
			System.out.println(x);
			System.out.println("Y = " + y);
			x *= 2;
			y += 10;
		}
		
		sc.close();
	}

}