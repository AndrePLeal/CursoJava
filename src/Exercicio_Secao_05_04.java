import java.util.Scanner;

public class Exercicio_Secao_05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horaInicio;
		int horaFim;
		int duracao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe as Horas de Inicio e Final do Jogo");
		
		horaInicio = sc.nextInt();
		horaFim = sc.nextInt();
		
		if (horaInicio > horaFim) {
			  duracao = ((24 - horaInicio) + horaFim); 
		}
	    else {
	         if (horaInicio == horaFim) {
	    		 duracao = 24;
	    	 }
		     else {
		    	 duracao = (horaFim - horaInicio); 
		     }
	      }
	        System.out.println("DURAÇÃO DO JOGO FOI DE: " + duracao + " horas");
			sc.close();
			System.out.println("O PROGRAMA TERMINOU !!!");
	}

}
