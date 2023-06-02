package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeMesa_03 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 100, y = 100;
		
		while(x != y) {
			System.out.println("Olha");
			x = (int) Math.sqrt(y);
		}
		
		sc.close();
	}

}



//Não imprime nada...
