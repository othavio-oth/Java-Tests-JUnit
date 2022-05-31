package exercicio7.production;

public class Gerente extends Funcionario {


	public Gerente(String nome, int idade) {
		super(nome, idade, bonificacao());
	}
	
	public static double bonificacao() {
		return bonificacao(10000.00);
	}
}

