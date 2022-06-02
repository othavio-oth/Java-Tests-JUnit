package exercicio7.production;

public class Index {
	
	public static void main(String args[]) {
		
		
		System.out.println("Gerente:");
		Gerente g1 = new Gerente("Lucas", 41);
		System.out.println(g1);
		
		
		System.out.println("Supervisor:");
		Supervisor s1 = new Supervisor("Mario", 32);
		System.out.println(s1);
		
		
		System.out.println("Vendedor:");
		Vendedor v1 = new Vendedor("Rafael",25);
		System.out.println(v1);
		
	}

}
