package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExperienciasFOR {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int total, repeticao, quantidade;
		double percentualC, percentualR, percentualS, qntC = 0, qntR = 0, qntS = 0;
		char tipo;
		
		System.out.print("Quantos casos de teste serão digitados? ");
		repeticao = sc.nextInt();

		for (int i = 0; i < repeticao; i++) {
			System.out.print("Quantidade de cobaias: ");
			quantidade = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);

			if (tipo == 'C') {
				qntC += quantidade;
			} else if (tipo == 'R') {
				qntR += quantidade;
			} else if (tipo == 'S') {
				qntS += quantidade;
			}

		}

		total = (int) (qntC + qntR + qntS);
		percentualC = (qntC / total) * 100;
		percentualR = (qntR / total) * 100;
		percentualS = (qntS / total) * 100;

		System.out.println(" ");
		System.out.println("RELATÓRIO FINAL:");
		System.out.printf("Total %d cobaias %n", total);
		System.out.println("Total de coelhos: " + qntC);
		System.out.println("Total de ratos: " + qntR);
		System.out.println("Total de sapos: " + qntS);
		System.out.printf("Percentual de coelhos: %.2f%n", percentualC);
		System.out.printf("Percentual de ratos: %.2f%n", percentualR);
		System.out.printf("Percentual de sapos: %.2f%n", percentualS);

		sc.close();
	}

}
