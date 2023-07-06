package ExercicioEstruturaRepetitiva;

import java.util.Scanner;

public class exercicioAlexandre {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y = 0;
		int x = sc.nextInt();
		
		while (x != y) {
			
			System.out.println(y + ", " + x);
			y++;
		}
		
		sc.close();
	
	}

}
