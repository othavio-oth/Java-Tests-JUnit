package exercicio1.production;

	public class Index {
		public static void main(String args[]) {
			Veiculo f1 = new Veiculo("ford", "fiesta", "ABG4358", "preto", 0, false, 50, 0, 20000);
			f1.ligar();
			
			f1.acelerar();
			f1.acelerar();
			
			
			f1.abastecer(7); //mensagem quando n�o atingiu o limite de combust�vel
			f1.abastecer(10); // mensagem quando o limite de combust�vel foi ultrapassado
			
			f1.freiar();	
			
			f1.pintar("azul");
			
			f1.freiar();
			f1.desligar();
			
			
			
			
		}
	}
