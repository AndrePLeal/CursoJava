import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Secao_04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int peca_01;
		int nr_pecas_01;
		double vl_peca_01;
		
		int peca_02;
		int nr_pecas_02;
		double vl_peca_02;
		
		double vlr_total;
		
		Locale.setDefault(Locale.US);
		
        Scanner sc = new Scanner(System.in);
        
        peca_01 = sc.nextInt();
        nr_pecas_01 = sc.nextInt();
        vl_peca_01 = sc.nextDouble();
		
        peca_02 = sc.nextInt();
        nr_pecas_02 = sc.nextInt();
        vl_peca_02 = sc.nextDouble();
        
        vlr_total = ((nr_pecas_01 * vl_peca_01 ) + (nr_pecas_02 * vl_peca_02));
		
		System.out.printf("Valor a Pagar :  R$ %.2f" ,  vlr_total);
		
		sc.close();	

	}

}
