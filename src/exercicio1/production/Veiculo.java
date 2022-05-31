package exercicio1.production;

public class Veiculo {
		String marca;
		String modelo;
		String placa;
		String cor;
		float km;
		boolean isLigado;
		int litrosCombustivel;
		int velocidade;
		double preco;
		
		
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public float getKm() {
			return km;
		}

		public void setKm(float km) {
			this.km = km;
		}

		public boolean isLigado() {
			return isLigado;
		}

		public void setLigado(boolean isLigado) {
			this.isLigado = isLigado;
		}

		public int getLitrosCombustivel() {
			return litrosCombustivel;
		}

		public void setLitrosCombustivel(int litrosCombustivel) {
			this.litrosCombustivel = litrosCombustivel;
		}

		public int getVelocidade() {
			return velocidade;
		}

		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		
		
		public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
				int litrosCombustivel, int velocidade, double preco) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.placa = placa;
			this.cor = cor;
			this.km = km;
			this.isLigado = isLigado;
			this.litrosCombustivel = litrosCombustivel;
			this.velocidade = velocidade;
			this.preco = preco;
		}
		
		public Veiculo() {
			
		}
		
		public void acelerar() {
			if(this.isLigado)this.velocidade += 20;
			else {
				System.out.println("O carro precisa estar  ligado para acelerar");
			}
			System.out.println("Acelerou! Agora a velocidade é de "+velocidade);
		}
		
		public void abastecer(int combustivelParaAbastecer) {
			
			int limiteCombustivel = 60;
			
			if(litrosCombustivel + combustivelParaAbastecer <=limiteCombustivel) {
				litrosCombustivel += combustivelParaAbastecer;
				System.out.printf("Agora temos %s litros de combust�vel \n",litrosCombustivel );
			} else {
				int combustivelQueCabe = limiteCombustivel-litrosCombustivel;
				litrosCombustivel+=combustivelQueCabe;
				
				int sobra = combustivelParaAbastecer - combustivelQueCabe;
				System.out.println("Encheu o tanque e sobrou " +sobra+" litros.");
			}
		}
		
		public void freiar() {
			if(velocidade >= 20) {
				velocidade -= 20;
			System.out.println("Freiou! Agora a velocidade � de "+velocidade);

			}
			else {
				velocidade = 0;
				System.out.println("Agora o carro está parado");
			}
		}
		
		public void pintar(String novaCor) {
			this.cor = novaCor;
			System.out.println("Agora o carro é "+cor);
		}
		
		public void desligar(){
			if(velocidade == 0) {
				this.isLigado = false;
				System.out.println("Agora o carro está desligado.");
			}
			System.out.println("O carro precisa estar parado para ser desligado");
		}
		public void ligar() {
			isLigado = true;
		
		}
	}

