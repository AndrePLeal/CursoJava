package util;

public class converte_Dolar {
	
	public static final double IOF = 0.06; 
	
	public static double calculaValorEmReal(double valorDoDolar, double qtdeDolar) { 
		double valorTotalSemIof = (valorDoDolar * qtdeDolar);
		double valorDoIof = valorTotalSemIof * IOF;
		return (valorTotalSemIof + valorDoIof);
//		return (valorDoDolar * qtdeDolar);
	}	  
}