package entities;

public class employee {
	
	public String nome;
	public double salario;
	public double imposto;
	
	public double salarioLiq() {
	    
		return (salario - imposto);
	}
	public void aumentaSalario(double perc) {
	     
		double percAumento = (salario * perc) / 100;
		salario = (salario + percAumento);	
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", (salarioLiq()));
    }
}

