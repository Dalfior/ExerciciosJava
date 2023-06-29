package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramPOOFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println("Nome: ");
		employee.name = sc.next();
		System.out.println("Salário bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Imposto: ");
		employee.tax = sc.nextDouble();

		System.out.println(employee);

		sc.close();

	}

}
