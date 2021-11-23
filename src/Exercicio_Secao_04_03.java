import java.util.Scanner;

public class Exercicio_Secao_04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		int d;
		int dif;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		dif = (a * b - c * d);
		
		System.out.println("Diferença: " + dif);
		
		sc.close();
	}

}
