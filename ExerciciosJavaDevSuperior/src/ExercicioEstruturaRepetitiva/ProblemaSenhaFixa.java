package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSenhaFixa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Digite a senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			
			if(senha == 2002) {
				//System.out.println("Acesso permitido!");
			}
			else {
				System.out.print("Senha Inválida! Tente novamente: ");
				senha = sc.nextInt();
			}
		}
		
		System.out.println("Acesso permitido!");
		
		
		
		sc.close();
	}

}
