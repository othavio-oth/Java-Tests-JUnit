package exercicio2.production;

public class Livro extends Produto{
	
	String autor;
	String tema;
	int qtdPag;

	
	public Livro() {
		
	}
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}


	public int getQtdPag() {
		return qtdPag;
	}


	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	
	Imposto taxa = new Taxa();
	

	public double calculaImposto(){
		
		double valorImposto = taxa.defineImposto(this.tema)*this.preco;
		return valorImposto;
		
	
}

	

}
