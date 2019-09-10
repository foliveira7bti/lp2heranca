package lp2heranca;

public class Diretor extends Gerente{
	private String atributoDeDiretor;

	public String getAtributoDeDiretor() {
		return atributoDeDiretor;
	}
	
	public double getBonificacao()
	{
		return this.salario * 0.08;
	}
	

}
