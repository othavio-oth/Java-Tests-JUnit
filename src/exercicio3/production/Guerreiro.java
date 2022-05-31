package exercicio3.production;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem {
	 

		List<Habilidades> habilidades = new ArrayList<>();
		
		public Guerreiro(String nome) {
			super(nome, 15, 30 );
			
		}
		
		

		public List<Habilidades> getHabilidades() {
		return habilidades;
	}

		
		
		public void attack() {
			super.attack(this.forca);
		}
		
		public void lvlUp() {
			super.lvlUp(forca, vida);
		}
		
		public void aprenderHabilidade(Habilidades habilidade) {
			habilidades.add(habilidade);
		}
		

	
}
