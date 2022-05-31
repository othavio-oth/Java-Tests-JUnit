	package exercicio3.test;

	import static org.junit.Assert.*;

	import org.junit.Before;
	import org.junit.Test;

import exercicio3.production.Guerreiro;
import exercicio3.production.Habilidades;

	public class GuerreiroTest {
		
		Guerreiro guerreiro;
		
		@Before
		public void setup() {
			guerreiro = new Guerreiro("Mario");
		}
		
		@Test
		public void deveAprenderHabilidade() throws Exception {
			guerreiro.aprenderHabilidade(Habilidades.APUNHALADA);
			
			assertEquals(Habilidades.APUNHALADA, guerreiro.getHabilidades().get(0));
		}
		
		
		@Test
		public void deveSubirDeNivel() throws Exception {
			guerreiro.lvlUp();
			guerreiro.lvlUp();
			
			assertEquals(3, guerreiro.getLevel());
		}
		
		@Test
		public void deveLancarAttack() throws Exception {
			guerreiro.attack();
		}

	

}
