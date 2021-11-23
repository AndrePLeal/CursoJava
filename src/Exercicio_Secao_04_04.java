import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Secao_04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matr_func;
		double hr_trab;
		double vl_hora;
		double vl_receber;
		
		Locale.setDefault(Locale.US);
		
        Scanner sc = new Scanner(System.in);
        
        matr_func = sc.nextInt();
        hr_trab = sc.nextDouble();
        vl_hora = sc.nextDouble();
		
        vl_receber = (hr_trab * vl_hora);
		
		System.out.println("Matricula: " + matr_func);
		System.out.printf("Salary U$ %.2f" , vl_receber);
		
		sc.close();
		
	}

}
