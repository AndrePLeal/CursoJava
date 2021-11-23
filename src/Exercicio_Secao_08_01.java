import java.util.Scanner;

import entities.Retangle;

public class Exercicio_Secao_08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Retangle a;
		a = new Retangle();
		
		System.out.println("Entre com a alture a base do Retangulo");
		
		a.altura = sc.nextDouble();
		a.base = sc.nextDouble();
		
		System.out.println("Altura => " + a.altura);
		System.out.println("Base   => " + a.base);
		
		double calcArea = a.area();
		System.out.println("Area        => " + calcArea);
		
		double calcPerim = a.perimetro();
		System.out.println("Perimetro   => " + calcPerim);
		
		double calcDiag = a.diagonal();
		System.out.println("Diagonal    => " + calcDiag);
		sc.close();
	}

}
