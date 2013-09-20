package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contas.Contas;

public class ContasTest {

	Contas umaConta;
	
	@Before
	public void setUp() throws Exception {
		umaConta = new Contas();
	}

	//Testar método calculoQuadrado
	@Test
	public void testCalculaQuadradoZero() {
		assertEquals(0,Contas.calculaQuadrado(0),0.01);
	}
	
	@Test
	public void testCalculaQuadradoPositivoPequeno() {
		assertEquals(30.25,Contas.calculaQuadrado(5.5),0.01);
	}
	
	@Test
	public void testCalculaQuadradoNegativoPequeno() {
		assertEquals(25,Contas.calculaQuadrado(-5),0.01);
	}
	
	@Test
	public void testCalculaQuadradoPositivoGrande() {
		assertEquals(947169,Contas.calculaQuadrado(987),0.01);
	}
	
	@Test
	public void testCalculaQuadradoNegativoGrande() {
		assertEquals(344216.89,Contas.calculaQuadrado(-586.7),0.01);
	}
	
	
	//Testar método calculoCubo

	@Test
	public void testCalculaCuboZero() {
		assertEquals(0,Contas.calculaCubo(0),0.01);
	}
	
	@Test
	public void testCalculaCuboPositivoPequeno() {
		assertEquals(125,Contas.calculaCubo(5),0.01);
	}
	
	@Test
	public void testCalculaCuboNegativoPequeno() {
		assertEquals(-166.375,Contas.calculaCubo(-5.5),0.01);
	}
	
	@Test
	public void testCalculaCuboPositivoGrande() {
		assertEquals(665338.617,Contas.calculaCubo(87.3),0.01);
	}
	
	@Test
	public void testCalculaCuboNegativoGrande() {
		assertEquals(-941192,Contas.calculaCubo(-98),0.01);
	}
	

}
