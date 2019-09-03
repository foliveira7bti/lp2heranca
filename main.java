package aulaheranca;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		
		gerente.setNome("João da Silva");
		
		gerente.setSenha(4321);
		
		gerente.setSalario(5000);
		
		System.out.println(gerente.getBonificacao());
		
		//System.out.println("Valores setados!");
	}

}
