package CursoDevSuperior;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDuracao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int duracao, hora, minuto, segundo, resto;
		
		System.out.println("Digite a duração em segundos: ");
		duracao = sc.nextInt();
		
		hora = duracao / 3600;
		resto = duracao % 3600;
		
		minuto = resto / 60;
		segundo = resto % 60;
		
		System.out.println(hora + ":" + minuto + ":" + segundo );
		
		sc.close();
		
		
	}

}
