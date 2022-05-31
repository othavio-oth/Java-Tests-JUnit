package exercicio3.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercicio3.production.Magias;
import exercicio3.production.Mago;

public class MagoTest {
	
	Mago mago;
	
	@Before
	public void setup() {
		mago = new Mago("Adolf");
	}
	
	@Test
	public void deveAprenderMagia() throws Exception {
		mago.aprenderMagia(Magias.LANÇAFOGO);
		
		assertEquals(Magias.LANÇAFOGO, mago.getMagias().get(0));
	}
	
	
	@Test
	public void deveSubirDeNivel() throws Exception {
		mago.lvlUp();
		
		assertEquals(2, mago.getLevel());
	}
	
	@Test
	public void deveLancarAttack() throws Exception {
		mago.attack();
	}

}
