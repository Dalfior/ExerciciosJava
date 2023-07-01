package entities;

public class RetanguloPOO {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width + height) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f%n", area())
				+ "PERIMETRO = " + String.format("%.2f%n", perimeter())
				+ "DIAGONAL = " + String.format("%.2f%n", diagonal());
	}

}
