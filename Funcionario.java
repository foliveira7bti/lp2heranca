package lp2heranca;

public abstract class Funcionario {
	protected String nome;
	protected String CPF;
	protected double salario;
	
	public abstract double getBonificacao();
	

	public void setSalario(int i) {
		salario = i;
		
	}
}
