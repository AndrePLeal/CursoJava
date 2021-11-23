package entities;

public class Retangle {

	public double altura;
	public double base;
	
	public double area() {
	     
		double calcArea = altura * base;
		return calcArea;
	 
	}
	public double perimetro() {
	     
		double calcPerim = (altura * 2) + (base * 2);
		return calcPerim;
	}
	public double diagonal() {
	     
		double calcDiag = Math.sqrt(Math.pow(altura,2) + Math.pow(base , 2));
		return calcDiag;
	}
	
}
