package entities;

public class Student {
	
	public String nome;
	public double primeiraNota;
	public double segundaNota;
	public double terceiraNota;
	public double total;
	
	public double somaNota() {
		total = primeiraNota + segundaNota + terceiraNota;
		return total;
	}
	
	public void checarAprovacao() {
		if (somaNota() >= 60){
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("FALTARAM %.2f%n ", 60 - somaNota());
		}
	}

}
