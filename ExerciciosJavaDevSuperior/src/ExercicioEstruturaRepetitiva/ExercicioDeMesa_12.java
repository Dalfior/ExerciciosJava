package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeMesa_12 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 8, y = 3, i;
		
		for(i=0;y<x;i++) {
			x = x - 2;
			y = y + 1;
			System.out.println(i);
		}
		
		sc.close();
		
	}

}
