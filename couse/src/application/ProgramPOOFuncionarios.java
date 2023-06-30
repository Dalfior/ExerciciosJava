package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramPOOFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		System.out.print("Salário bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();

		System.out.println("Funcionário: " + employee.name + ", $ " + employee.netSalary());
		
		System.out.print("Qual o percentual para aumentar o salário? ");
		employee.percentage = sc.nextDouble();
		
		System.out.println("Funcionário: " + employee.name + ", $ " + employee.increaseSalary());
		

		sc.close();

	}

}
