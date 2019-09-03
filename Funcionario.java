package aulaheranca;

public class Funcionario {
	protected String nome;
	protected String CPF;
	protected double salario;
	
	public double getBonificacao()
	{
		return this.salario * 0.10;
	}
	

	public void setSalario(int i) {
		salario = i;
		
	}
}
