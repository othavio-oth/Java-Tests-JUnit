package exercicio2.test;

import exercicio2.production.Livro;
import exercicio2.production.Loja;
import exercicio2.production.VideoGame;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class CalculaPatrimonioTest {
	
	Loja loja;
	Livro l1 = new Livro("O Senhor dos Aneis",60,30,"J. K. Rowling","Fantasia",500);
	Livro l2 = new Livro("Harry Potter",40,50,"J. R. R. Tolkien","Fantasia",300);
	Livro l3 = new Livro("JAVA POO", 20,50,"GFT","educativo",500);
	
	VideoGame ps4 = new VideoGame("PS4",1800,100,"SONY","SLIM",false);
	VideoGame ps4Usado = new VideoGame("PS4",1000,7,"SONY","SLIM",true);
	VideoGame xbox = new VideoGame("XBOX",1500,500,"MICROSOFT","ONE",false);
	


		List<Livro> livros = new ArrayList<>();
		List<VideoGame> games = new ArrayList<>();

		
	@Before
	public void setup() {
		adicionaLivrosNaLista(livros);
		adicionaGamesNaLista(games);

		loja = new Loja("Americanas","123456789",livros,games);


	}
	
	
	@Test
	public void lojaDeveAdicionarListaDeLivrosNoContrutor() throws Exception {
		assertEquals(livros, loja.getLivros());
	}
	
	
	@Test
	public void lojaDeveAdicionarListaDeGamesNoContrutor() throws Exception {
	assertEquals(games, loja.getVideogames());
	}
	
	@Test
	public void deveCalcularPatrimonio() throws Exception {
		assertEquals(941800.0, loja.calculaPatrimonio(),0000.1);
	}
	
	
	
	
	
	private void adicionaLivrosNaLista(List<Livro> livros) {
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
	}
	
	private void adicionaGamesNaLista(List<VideoGame> games) {
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
	}
	
	
	
	
	
	

}
