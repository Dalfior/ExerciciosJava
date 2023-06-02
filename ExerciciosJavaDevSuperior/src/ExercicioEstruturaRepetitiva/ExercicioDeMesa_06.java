package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeMesa_06 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 4, y = 0, i = 0;
		
		while(i < x) {
			i += 1;
			y += i;
			System.out.print(i);
			System.out.println(y);
		}
		
		
		sc.close();
	}

}
