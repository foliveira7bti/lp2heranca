package lp2heranca;

public class Gerente extends Funcionario{
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		}else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	void setNome(String string) {
		this.nome = string;
	}

	void setSenha(int i) {
		this.senha = i;
		
	}
	
	public double getBonificacao()
	{
		return this.salario * 0.15;
	}

}
