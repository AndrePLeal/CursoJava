import java.util.Scanner;

import util.converte_Dolar;

public class Exercicio_Secao_08_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a cotação do dolar");
		double valorDolar = sc.nextDouble();
		System.out.println("Quantos dolares desejam comprar");
		double qtdeDolar = sc.nextDouble();
//		double valorDolar = converte_Dolar.valorDoDolar(valorDolar);
//		double qtdeDolar = converte_Dolar.qtdeDolar(qtdeDolar);
		double valorPagto = converte_Dolar.calculaValorEmReal(valorDolar,qtdeDolar);
		System.out.println("Valor a pagar " + valorPagto);
		
	    sc.close();
	}
}
