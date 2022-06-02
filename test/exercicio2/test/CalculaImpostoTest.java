package exercicio2.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercicio2.production.Livro;
import exercicio2.production.VideoGame;

public class CalculaImpostoTest {
	
	
	Livro livro;
	VideoGame game;
	
	
	@Before
	public void setup() {
		 livro = new Livro();
		 game = new VideoGame();
	}
	
	
	
	
	@Test
	public void deveCalcularImpostoDeLivroNaoEducativo() throws Exception {
		livro.setTema("ficcao");
		livro.setPreco(50);
		
		assertImpostoProduto(5,livro.calculaImposto());
	}
	
	
	@Test
	public void deveCalcularImpostoDeLivroEducativo() throws Exception {
		livro.setTema("educativo");
		livro.setPreco(100);
		
		assertImpostoProduto(0,livro.calculaImposto());
	}
	
	@Test
	public void deveCalcularImpostoDeGameUsado() throws Exception {
		game.setUsado(true);
		game.setPreco(200);
		
		assertImpostoProduto(50,game.calculaImposto());
	}

	
	@Test
	public void deveCalcularImpostoDeGameNovo() throws Exception {
		game.setUsado(false);
		game.setPreco(100);
		
		assertImpostoProduto(45,game.calculaImposto());
	}
	
	
	private void assertImpostoProduto(double esperado, double imposto) {
		assertEquals(esperado,imposto,000.1);
	}
	
	
	

}
