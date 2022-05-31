package exercicio1.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercicio1.production.Veiculo;

public class VeiculoTest {
	
	
	Veiculo v;
	
	@Before
	public void setup() {
		v = new Veiculo();
		v.ligar();
	}
	
	
	
	@Test
	public void verificaSePodeLigarVeiculo() throws Exception {
		assertEquals(v.isLigado(), true);
	}
	
	
	@Test
	public void verificaSePodeDesligarVeiculo() throws Exception {
		v.desligar();
		
		assertFalse(v.isLigado());
	}
	
	@Test
	public void deveDesligarVeiculoApenasSeEstiverParado() throws Exception {
		v.setVelocidade(20);
		v.desligar();
		
		
		assertTrue(v.isLigado());
	}
	
	@Test
	public void deveAcelerarApenasSeEstiverLigado() throws Exception {
		v.desligar();
		v.acelerar();
		
		assertEquals(0, v.getVelocidade());
		
	}
	
	@Test
	public void deveAcelerar20kmPorHora() throws Exception {
		v.acelerar();
		
		assertEquals(20, v.getVelocidade());
	}
		
	
	@Test
	public void deveFreiar20kmPorHoraQuandoFrearForChamado() throws Exception {
		v.setVelocidade(72);
		v.freiar();
		
		assertEquals(52,v.getVelocidade());
	}
	
	@Test
	public void deveAbastecerSomenteAte60Litros() throws Exception {
		v.setLitrosCombustivel(45);
		v.abastecer(20);
		
		assertEquals(60, v.getLitrosCombustivel());
	}
	
	
	@Test
	public void devePintarVeiculo() throws Exception {
		v.pintar("vermelho");
		
		assertEquals("vermelho", v.getCor());
	}



	
	
	
	
	

}