package exercicio2.production;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Loja {
	
	
	String nome, cnpj;
	
	Loja(){}
	

	
	
	Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videogames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videogames = videogames;
		
	}




	List <Livro> livros = new ArrayList<>();
	List <VideoGame> videogames = new ArrayList<VideoGame>();

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public List<VideoGame> getVideogames() {
		return videogames;
	}	
	
	

	public void listaLivros() {
		System.out.printf("A loja %s possui estes livros para venda:\n", nome);
		for (Iterator<Livro> iterator = livros.iterator(); iterator.hasNext();) {
			Livro livro = (Livro) iterator.next();
				System.out.printf("T�tulo: %s | Pre�o: %2f | Quantidade: %s em estoque. \n", livro.getNome(), livro.getPreco(), livro.qtd);
		}
		
	}
	public void listaGames() {
		System.out.printf("A loja %s possui estes videogames para venda:\n", nome );
		for (Iterator iterator = videogames.iterator(); iterator.hasNext();) {
			VideoGame game = (VideoGame) iterator.next();
			System.out.printf("Videogame: %s | Pre�o: %2f | Quantidade: %s em estoque. \n", game.getNome(), game.getPreco(), game.qtd);
						
		}
	}		
	
	Imposto taxa = new Taxa();
	
	
		
	
	
	
	
	public void calculaPatrimonio() {
		double patrimonioEmLivros = 0;
		for (Livro livro : livros) {
			patrimonioEmLivros+=livro.preco*livro.qtd;
		}
		double patrimonioEmGames = 0;
		for (VideoGame game : videogames) {
			patrimonioEmGames +=game.preco*game.qtd;
		}
		
		double patrimonioTotal = patrimonioEmGames + patrimonioEmLivros;
		System.out.println("O patrimonio total � " + patrimonioTotal);
		System.out.println(patrimonioEmGames);
		System.out.println(patrimonioEmLivros);
		
	}
	
	


	
		
	

}
