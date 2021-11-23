import java.util.Scanner;

import entities.employee;

public class Exercicio_Secao_08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
		
		employee emp;
		emp = new employee();
		
		System.out.println("Entre com o nome, salario e imposto");
		
		emp.nome = sc.next();	
		emp.salario = sc.nextDouble();
		emp.imposto = sc.nextDouble();
		System.out.println("Salario Liquido  => " + emp.salarioLiq());
		
		System.out.println("Entre percentual de aumento");
		double perc = sc.nextDouble();
		emp.aumentaSalario(perc);
		
		System.out.println("Salario Liquido com aumento => " + emp);
		sc.close();
	}
	
}
