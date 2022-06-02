package exercicio3.production;

public class Index{
	
	public static void main(String args[]) {
		Mago mago = new Mago("Robert");
		mago.attack();
		mago.aprenderMagia(Magias.LANÇAFOGO);
		mago.aprenderMagia(Magias.ANDARSOBREAGUA);
		mago.lvlUp();
		
		System.out.println(mago.getMagias());
		
		
		Guerreiro espadachim = new Guerreiro("Florence");
		espadachim.attack();
		espadachim.lvlUp();
		espadachim.aprenderHabilidade(Habilidades.APUNHALADA);
		espadachim.aprenderHabilidade(Habilidades.SOCO);
		
		System.out.println(espadachim.getHabilidades());
		
	
	}

} 
