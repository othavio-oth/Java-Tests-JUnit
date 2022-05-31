package exercicio7.production;

public class Vendedor extends Funcionario {
	
	public Vendedor(String nome, int idade) {
		super(nome, idade, bonificacao());
	}
	
	public static double bonificacao() {
		return bonificacao(3000.00);
	}

}
