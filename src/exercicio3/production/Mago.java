package exercicio3.production;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem {

	
	List<Magias> magias = new ArrayList<>();		
			
	public Mago(String nome) {
		super(nome,  40, 10);
		
	}
	
	
	public List<Magias> getMagias(){
		return magias;
	}
	
	
	public void attack() {
		super.attack(this.inteligencia);
	}
	
	public void lvlUp() {
		super.lvlUp(inteligencia, mana);
	}
	
	public void aprenderMagia(Magias magia) {
		magias.add(magia);
	}


	

}
