import java.util.Scanner;

public class Exercicio_Secao_04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 3.14159;
		double raio;
		double compr;
		
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		
		compr = 2 * pi * raio;
		
		System.out.printf("Comprimento Circunferência : %.4f" , compr);
		
		sc.close();

	}

}
