package exercicio2.production;

import java.util.ArrayList;
import java.util.List;

public class Index {

	public static void main(String args[]) {
		Livro l1 = new Livro("O Senhor dos An�is",60,30,"J. K. Rowling","Fantasia",500);
		Livro l2 = new Livro("Harry Potter",40,50,"J. R. R. Tolkien","Fantasia",300);
		Livro l3 = new Livro("JAVA POO", 20,50,"GFT","educativo",500);
		
		
//		
//		if( valorTaxa>0) {
//			System.out.println("A taxa do livro "+this.nome+"  � "+ taxa.defineImposto(this.tema)*this.preco );
//		}
//		else {
//			System.out.println("Livro educatico n�o tem taxa: "+this.nome);
//		}
//		System.out.println("A taxa do Game "+this.nome+"  � "+ valorTaxa );

		
		
		l1.calculaImposto();
		l3.calculaImposto();
		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		
		VideoGame ps4 = new VideoGame("PS4",1800,100,"SONY","SLIM",false);
		VideoGame ps4Usado = new VideoGame("PS4",1000,7,"SONY","SLIM",true);
		VideoGame xbox = new VideoGame("XBOX",1500,500,"MICROSOFT","ONE",false);
		List<VideoGame> games = new ArrayList<VideoGame>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
		Loja americanas = new Loja("Americanas","123456789",livros,games);
		
		americanas.listaLivros();
		americanas.listaGames();
		
		
		americanas.calculaPatrimonio();
	
	
		
		
		
	}
}
