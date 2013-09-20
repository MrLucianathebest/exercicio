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
		assertEquals(0,umaConta.calculaQuadrado(0),0.01);
	}
	
	@Test
	public void testCalculaQuadradoPositivoPequeno() {
		assertEquals(30.25,umaConta.calculaQuadrado(5.5),0.01);
	}
	
	@Test
	public void testCalculaQuadradoNegativoPequeno() {
		assertEquals(25,umaConta.calculaQuadrado(-5),0.01);
	}
	
	@Test
	public void testCalculaQuadradoPositivoGrande() {
		assertEquals(947169,umaConta.calculaQuadrado(987),0.01);
	}
	
	@Test
	public void testCalculaQuadradoNegativoGrande() {
		assertEquals(344216.89,umaConta.calculaQuadrado(-586.7),0.01);
	}
	
	
	//Testar método calculoCubo

	@Test
	public void testCalculaCuboZero() {
		assertEquals(0,umaConta.calculaCubo(0),0.01);
	}
	
	@Test
	public void testCalculaCuboPositivoPequeno() {
		assertEquals(125,umaConta.calculaCubo(5),0.01);
	}
	
	@Test
	public void testCalculaCuboNegativoPequeno() {
		assertEquals(-166.375,umaConta.calculaCubo(-5.5),0.01);
	}
	
	@Test
	public void testCalculaCuboPositivoGrande() {
		assertEquals(665338.617,umaConta.calculaCubo(87.3),0.01);
	}
	
	@Test
	public void testCalculaCuboNegativoGrande() {
		assertEquals(-941192,umaConta.calculaCubo(-98),0.01);
	}
	

}
