package exercicio.dojopuzzles.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import exercicio.dojopuzzles.production.Ano;

public class FizzBuzzTest {
	
	Ano ano;
	@Before
	public void setup() {
		 ano = new Ano();

	}
	
	
	@Test
	public void deveCalcularSeAnoEhBissexto() throws Exception {
		 assertEquals(ano.EhBissexto(2016), true);
	}
	
	@Test
	public void deveCalcularSeAnoNaoEhBissexto() throws Exception {
		 assertEquals(ano.EhBissexto(2019), false);
	}
	
	

}
