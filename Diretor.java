package aulaheranca;

public class Diretor extends Funcionario{
	private String atributoDeDiretor;

	public String getAtributoDeDiretor() {
		return atributoDeDiretor;
	}
	
	public double getBonificacao()
	{
		return this.salario * 0.08;
	}
	

}
