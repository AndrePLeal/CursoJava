import java.util.Scanner;

import entities.notaEstudante;

public class Exercicio_Secao_08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		notaEstudante nest;
		nest = new notaEstudante();
		
		System.out.println("Entre com o nome, e as tres notas");
		
		nest.nomeAluno = sc.next();	
		nest.nota1Sem = sc.nextDouble();
		nest.nota2Sem = sc.nextDouble();
		nest.nota3Sem = sc.nextDouble();
		
//		System.out.println("Nota Final => " + nest.notaFinal());

//		System.out.println("Boletim Final => " + nest);
				
		System.out.println("Boletim Final => " + nest.toString());
		
		sc.close();
	}

}
