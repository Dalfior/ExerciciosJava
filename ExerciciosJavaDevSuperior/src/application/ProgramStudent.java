package application;

import java.util.Locale;
import java.util.Scanner;

import ExerciciosEstruturaSequencial.ProblemaSoma;
import entities.Student;

public class ProgramStudent {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Digite o nome: ");
		student.nome = sc.nextLine();
		System.out.println("Digite TRÊS notas: ");
		student.primeiraNota = sc.nextDouble();
		student.segundaNota = sc.nextDouble();
		student.terceiraNota = sc.nextDouble();
		
		System.out.print("NOTA FINAL = " + student.somaNota());
		System.out.println();
		student.checarAprovacao();
		
		
		
		sc.close();		
		
	}

}
