package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeMesa_08 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, i;
		
		for (i=1; i<5; i++) {
			y = i - 1;
			x = i * 10;
			System.out.println(i);
		}
		
		
		sc.close();
				
				
	}

}
