package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosScanner {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(1);
		System.out.printf("Você digitou: " + x);
		
		
		
		
		sc.close();
	}

}
