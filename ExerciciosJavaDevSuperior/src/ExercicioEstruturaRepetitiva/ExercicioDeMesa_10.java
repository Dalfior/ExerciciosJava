package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeMesa_10 {
	
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 4, y = 0, i;
		
		for(i=0; i<x; i++) {
			System.out.print(i);
			System.out.println(x);
			y = y + 10;
		}
		
		sc.close();
	}

}
