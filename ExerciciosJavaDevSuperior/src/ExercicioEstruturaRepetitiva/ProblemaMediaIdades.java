package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaIdades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = 0, contador = 0;
		double soma = 0, media;

		System.out.println("Digite as idades: ");

		idade = sc.nextInt();
		if (idade < 0) {
			System.out.println("IMPOSSÍVEL CALCULAR.");
		}

		else {

			while (idade >= 0) {

					contador += 1;
					soma += idade;
				    idade = sc.nextInt();

			}
			media = soma / contador;

			System.out.printf("MEDIA: %.2f%n", media);
		}

		sc.close();
	}

}
