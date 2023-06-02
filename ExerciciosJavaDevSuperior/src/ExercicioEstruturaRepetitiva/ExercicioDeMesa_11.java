package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeMesa_11 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 4, y = 0, i;
		
		for (i=0; i<x; i++) {
			y = y + i;
		}
		System.out.println(y);
		
		sc.close();
	}

}
