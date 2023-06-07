package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaValidacaoNota {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double primeiraNota = 0, segundaNota = 0;
		String sair = null;

		while (sair != "sim") {

			System.out.println("Digite a primeira nota: ");
			primeiraNota = sc.nextDouble();

			if (primeiraNota < 0 || primeiraNota > 10) {
				while (primeiraNota < 0 || primeiraNota > 10) {
					System.out.println("Valor inválido! Tente novamente: ");
					primeiraNota = sc.nextDouble();
				}
			}


			
			System.out.println("Digite a segunda nota: ");
			segundaNota = sc.nextDouble();
			
			if(segundaNota < 0 || segundaNota > 10) {
				while (segundaNota < 0 || segundaNota > 10) {
					System.out.println("Valor inválido! Tente novamente: ");
					segundaNota = sc.nextDouble();
				}
			}

			double media = (primeiraNota + segundaNota) / 2;
			System.out.println("MEDIA = " + media);
			System.out.println(" ");

			// else {
			// System.out.println("Deseja sair? Digite sim ou não: ");
			// sair = sc.next();
			// if(sair == "sim") {
			// break;
			// }
			// else {
			// continue;
			// }
			// }

		}

		sc.close();
	}

}
