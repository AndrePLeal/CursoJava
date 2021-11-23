import java.util.Locale; 
import java.util.Scanner;
import entities.Aluguel;
import entities.aumentaSalario;
public class Exercicio_Secao_10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com número de Funcionários");
		int n = sc.nextInt(); 
		System.out.println("quantidade Funcionarios => " + n); 
		aumentaSalario [] vect = new aumentaSalario[n];
		sc.nextLine();
		for (int i=0; i < n; i++) { 
			System.out.println("informe ib :");
			int id = sc.nextInt();
			System.out.println("informe nome :");
            String nome = sc.next(); 
            System.out.println("informe salario :");
            Double salario = sc.nextDouble();
            int perc = sc.nextInt();
			vect[id] = new aumentaSalario(id,nome,salario,perc ); 
            }
		
		System.out.println("-----------------  sai do for");	
		for (int i=0; i < n; i++) { 
			if (vect[i]	 != null) {
			   System.out.println("Funcionario = " + i + " :" + vect[i]);
			}
		} 	
		sc.close();
	}

}