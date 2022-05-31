package exercicio7.production;

abstract class Funcionario {
	String nome;
	int idade;
	double salario;
	
	public Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	
	public static double bonificacao(double valor) {
		return valor;
	}
	
	@Override
	public String toString() {
	  return String.valueOf(this.nome);
	}


	;
}
