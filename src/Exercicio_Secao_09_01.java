import java.util.Scanner;
import util.atualiza_Banco;

public class Exercicio_Secao_09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		atualiza_Banco conta;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o numero da conta :");
		int numContaCorrente = sc.nextInt();
		System.out.println("Entre com nome do correntista : ");
		String nomeCorrentista = sc.next();
		System.out.println("Esse dep�sito � inicial(y/n) : ");
		char flagInicial = sc.next().charAt(0);
		if (flagInicial == 'y')
		{
		   System.out.println("Entre com valor do dep�sito inicial : ");
		   double Saldo = sc.nextDouble();
		   conta = new atualiza_Banco(numContaCorrente,nomeCorrentista,Saldo);
		}	
		else
		{
			System.out.println("Entre com valor do dep�sito : ");
			conta = new atualiza_Banco(numContaCorrente,nomeCorrentista);
		}
		
		System.out.println("");
		System.out.println("REGISTRO : " + conta);
		
		System.out.println("");
		System.out.println("Entre com valor do dep�sito : ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("");
		System.out.println("REGISTRO atualizado : " + conta);
		
		System.out.println("");
		System.out.println("Entre com valor do saque : ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("");
		System.out.println("REGISTRO atualizado : " + conta);
		
//		double qtdeDolar = converte_Dolar.qtdeDolar(qtdeDolar);
//		double valorPagto = converte_Dolar.calculaValorEmReal(valorDolar,qtdeDolar);
		sc.close();
	}	
}
