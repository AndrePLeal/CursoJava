import java.util.Scanner;

public class Exercicio_Secao_05_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opcao;
		double x = 0.00;
		double y = 0.00;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{ 
		   System.out.println("Informe o valor de X e Y");
		   x = sc.nextDouble();
		   y = sc.nextDouble();
		   
           if ((x == y) && (y == 0.0)) { 
        	   System.out.println("O ponto está na Origem");
           }
           else if ((x > 0) && (y > 0)) {
		      System.out.println("O ponto está no Q1");
		     } 
		   else if ((x < 0) && (y > 0)) {
				  System.out.println("O ponto está no Q2"); 
		   }
		   else if ((x < 0) && (y < 0)) {
			   System.out.println("O ponto está no Q3");
		   }
		   else if ((x > 0) && (y < 0)) {
				  System.out.println("O ponto está no Q4"); 
			   }
		   else if (x == 0) {
				  System.out.println("O ponto está no Eixo X");   
				   }
		   else if (y == 0) {
			   System.out.println("O ponto está no Eixo Y");   
		   }           
              System.out.println("Para terminar digite s"); 
			  opcao = sc.next().charAt(0);
             	
		} while (opcao != 's');
				
		sc.close();
		System.out.println("O PROGRAMA TERMINOU !!!");	
		}
}
