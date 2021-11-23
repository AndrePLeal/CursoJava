import java.util.Scanner;

public class Exercicio_Secao_05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero01;
		int numero02;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os Números: ");
		
		numero01 = sc.nextInt();
		numero02 = sc.nextInt();
		
		
		  if (numero01 > numero02) {
			  if (numero01 % numero02 == 0) 	 			  
		          System.out.println("Números Múltiplos");
		      else {
		    	  System.out.println("Números não são Múltiplos");
		      }
		  }
		   else {
			   if (numero02 % numero01 == 0) 	 			  
			          System.out.println("Números Múltiplos");
			      else {
			    	  System.out.println("Números não são Múltiplos");
			      }
		   }
			sc.close();
			System.out.println("O PROGRAMA TERMINOU !!!");

	}

}
