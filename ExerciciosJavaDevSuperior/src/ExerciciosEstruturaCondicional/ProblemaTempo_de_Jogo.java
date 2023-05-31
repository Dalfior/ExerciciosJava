package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaTempo_de_Jogo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Hora inicial: ");
		horaInicial = sc.nextInt();
		System.out.println("Hora final: ");
		horaFinal = sc.nextInt();
		
		duracao = (24 - horaInicial) + horaFinal;
		
		if(duracao <= 24) {
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);			
		}
		else {
			System.out.println("Excedeu o tempo de horas permitidas para um jogo");
		}
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
