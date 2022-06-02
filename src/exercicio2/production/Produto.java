package exercicio2.production;

abstract class Produto {
	
	String nome;
	double preco;
	int qtd;
	static int qtdProdutos = 0;
	
	
	
	public Produto() {
		
	};
	
	
	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		qtdProdutos++;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + ", getNome()=" + getNome()
				+ ", getPreco()=" + getPreco() + ", getQtd()=" + getQtd() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
