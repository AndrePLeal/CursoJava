package entities;

public class aumentaSalario {

	public Integer matricula;
	public String  nome;
	public Double  salario;
	public Integer perc;
	
	public aumentaSalario(Integer matricula, String nome, Double salario, Integer perc) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		this.perc = perc;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getPerc() {
		return perc;
	}

	public void setPerc(Integer perc) {
		this.perc = perc;
	}
}
