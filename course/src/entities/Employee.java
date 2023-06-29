package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		percentage = ((grossSalary * tax) / 100) + grossSalary - tax;
		return percentage;
		
	}
	
	public String toString() {
		return "Funcionário: " + name + ", $ " + String.format("%.2f%n", netSalary()); 
	}
	
	public String toString2() {
		return "Dados atualizados: " + name + ", $ " + String.format("%.2f%n", increaseSalary(grossSalary));
	}

}
