import java.util.Scanner;

public class Exercicio_Secao_05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o N�mero: ");
		numero = sc.nextInt();
		  if (numero % 2 == 0) {
		   System.out.println("N�mero � par => " + numero);
		  }
		   else {
			   System.out.println("N�mero � Impar => " + numero);  
		   }
			sc.close();
			System.out.println("O PROGRAMA TERMINOU !!!");
	}

}
