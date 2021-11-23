import java.util.Scanner;

public class Exercicio_Secao_05_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int item;
		int qtde;
		char opcao;
		double valorTotal;
		double vlr_1 = 4.00;
		double vlr_2 = 4.50;
		double vlr_3 = 5.00;
		double vlr_4 = 2.00;
		double vlr_5 = 1.50;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{ 
		   System.out.println("Informe o item desejado e a quantidade");
		   System.out.println("1 - Cachorro Quente - R$ 4.00");
		   System.out.println("2 - X-Salada        - R$ 4.50");
		   System.out.println("3 - X-BACON         - R$ 5.00");
		   System.out.println("4 - Torrada         - R$ 2.00");
		   System.out.println("5 - Refrigerante    - R$ 1.50");
		   item = sc.nextInt();
		   qtde = sc.nextInt();
		   
		   switch (item) { 
		     case 1: 
		    	valorTotal = vlr_1 * qtde; 
		    	System.out.printf("Total foi de => R$  %.2f\n" , valorTotal);
		        break;
		     case 2: 
		    	 valorTotal = vlr_2 * qtde; 
			     System.out.printf("Total foi de => R$ %.2f\n" , valorTotal); 
		        break; 
		     case 3:
		    	 valorTotal = vlr_3 * qtde; 
			     System.out.printf("Total foi de => R$ %.2f\n" , valorTotal); 
		        break; 
		     case 4: 
		    	 valorTotal = vlr_4 * qtde; 
			     System.out.printf("Total foi de => R$ %.2f\n" , valorTotal); 
		        break;
		     case 5: 
		    	valorTotal = vlr_5 * qtde; 
			    System.out.printf("Total foi de => R$ %.2f\n" , valorTotal); 
		    	break; 
		    default: 
		    	System.out.println("Produto não cadastrado"); 
		    break; }

		      System.out.println("Para terminar digite s"); 
			  opcao = sc.next().charAt(0);
			
		} while (opcao != 's');
				
		sc.close();
		System.out.println("O PROGRAMA TERMINOU !!!");
	}

}
