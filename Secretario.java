package aulaheranca;

public class Secretario extends Funcionario{
	public String atributoDeSecretario;

	public String getAtributoDeSecretario() {
		return atributoDeSecretario;
	}
	
	public double getBonificacao()
	{
		return this.salario * 0.03;
	}

}
