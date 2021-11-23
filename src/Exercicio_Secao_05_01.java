
import java.util.Scanner;

public class Exercicio_Secao_05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		char opcao;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{ 
		  System.out.println("Informe o Número");
		  x = sc.nextInt();
		  if (x < 0) {
		   System.out.println("Negativo => " + x);
		   }
		   else {
		    System.out.println("Positivo => " + x);   
		   }
		  System.out.println("Para terminar digite S"); 
		  opcao = sc.next().charAt(0);

		} while (opcao != 's');
		
		
		sc.close();
		System.out.println("O PROGRAMA TERMINOU !!!");
	}
}
