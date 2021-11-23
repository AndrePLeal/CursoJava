package entities;

public class notaEstudante {
	
	public String nomeAluno;
	public double nota1Sem;
	public double nota2Sem;
	public double nota3Sem;
    public String flagAprovacao;
    public double notaFinal;
	
	public double notaFinal() {
	   notaFinal = (nota1Sem + nota2Sem + nota3Sem);
	   return notaFinal;
	}
    
	public String toString() {
		
		if (notaFinal() >= 60.0) { 
			   return flagAprovacao = nomeAluno + "Aprovado";
		   }
		    else {
		       double notaFaltante = 60 - notaFinal;	
		       return flagAprovacao = nomeAluno + " Reprovado por => " + notaFaltante + " pontos";
		   }
		}
    }