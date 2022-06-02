package exercicio7.test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import exercicio7.production.Gerente;
import exercicio7.production.Supervisor;
import exercicio7.production.Vendedor;

public class FuncionarioTest {

	
	Gerente gerente;
	Supervisor supervisor;
	Vendedor vendedor;
	@Before
	public void setup() {
		gerente = new Gerente("Firmino",40);
		supervisor = new Supervisor("Fábio", 30);
		vendedor = new Vendedor("Alisson", 23);
		
	}
	
	@Test
	public void deveRetornarBonificacaoAoGerente() throws Exception {
		assertEquals(10000, Gerente.bonificacao(),0000.1);
	}
	
	@Test
	public void deveRetornarBonificacaoAoSupervisor() throws Exception {
		assertEquals(5000, Supervisor.bonificacao(),0000.1);
	}
	
	
	@Test
	public void deveRetornarBonificacaoAoVendedor() throws Exception {
		assertEquals(3000, Vendedor.bonificacao(),0000.1);
	}
	
	
}
