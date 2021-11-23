package util;

public class atualiza_Banco {
	
	private int numContaCorrente;
	private String nomeCorrentista;
	private double Saldo;
	
	public atualiza_Banco(int numContaCorrente, String nomeCorrentista) {
		this.numContaCorrente = numContaCorrente;
		this.nomeCorrentista = nomeCorrentista;
	}

	public atualiza_Banco(int numContaCorrente, String nomeCorrentista,double saldo) {
		this.numContaCorrente = numContaCorrente;
		this.nomeCorrentista = nomeCorrentista;
		deposito(saldo);
	}

	public int getNumContaCorrente() {
		return numContaCorrente;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public double getSaldo() {
		return Saldo;
	}
	
	public void deposito(double saldo) {
		Saldo += saldo;
	}
	
	public void saque(double saldo) {
		Saldo -= (saldo + 5.00);
	}
	public String toString() {
		return ("CONTA : " + numContaCorrente
				           + " CORRENTISTA : " 
				           + nomeCorrentista
				           + " SALDO : " 
				           + String.format("%.2f", Saldo));
	}

}

