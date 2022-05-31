package exercicio7.production;

public class Index {
	
	public static void main(String args[]) {
		Gerente g1 = new Gerente("Lucas", 41);
		System.out.println(g1.idade);
		System.out.println(g1.salario);
		
		
		Supervisor s1 = new Supervisor("Mario", 32);
		System.out.println(s1.idade);
		System.out.println(s1.salario);
		
		Vendedor v1 = new Vendedor("Rafael",25);
		System.out.println(v1.idade);
		System.out.println(v1.salario);
		
	}

}
