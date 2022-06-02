package exercicio2.production;

public class VideoGame extends Produto{
	
	String marca, modelo;
	boolean isUsado;
	double valorTaxa;
	
	public VideoGame() {
		
	}
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome,preco,qtd);
		
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	
	
	public boolean isUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	
	Imposto taxa = new Taxa();

	public double calculaImposto(){
	valorTaxa = taxa.defineImposto(this.isUsado)*this.preco;
	return valorTaxa;
	
	
}
	

	public void mostrarTaxa() {
		System.out.println("A taxa do Game "+this.nome+" e "+ calculaImposto() );
	}
	
	
}
