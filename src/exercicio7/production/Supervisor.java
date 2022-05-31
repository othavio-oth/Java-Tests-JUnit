package exercicio7.production;

public class Supervisor extends Funcionario {
	 
		public Supervisor(String nome, int idade) {
			super(nome, idade, bonificacao());
		}
		
		public static double bonificacao() {
			return bonificacao(5000.00);
		}
	
}
