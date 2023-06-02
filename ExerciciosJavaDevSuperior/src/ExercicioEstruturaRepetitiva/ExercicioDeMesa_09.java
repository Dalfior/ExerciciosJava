package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeMesa_09 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int y = 10, i;
		for (i=0; i<4; i++) {
			System.out.print(i);
			y = y + i;
			System.out.println(y);
		}
		
		
	}

}
