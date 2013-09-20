package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contas.ContasNaoConfiaveis;
import contas.Contas;

public class ContasNaoConfiaveisTest {	

        Contas umaConta;
        ContasNaoConfiaveis outraConta;
        
        @Before
        public void setUp() throws Exception {
                umaConta = new Contas();
                outraConta = new ContasNaoConfiaveis();
                
        }

        //Testar método calculoQuadrado
        @Test
        public void testCalculaQuadradoZero() {
                assertEquals(umaConta.calculaQuadrado(0),outraConta.calculaQuadrado(0),0.01);
        }
        
        @Test
        public void testCalculaQuadradoPositivoPequeno() {
                assertEquals(umaConta.calculaQuadrado(5.5),outraConta.calculaQuadrado(5.5),0.01);
        }
        
        @Test
        public void testCalculaQuadradoNegativoPequeno() {
                assertEquals(umaConta.calculaQuadrado(-5),outraConta.calculaQuadrado(-5),0.01);
        }
        
        @Test
        public void testCalculaQuadradoPositivoGrande() {
                assertEquals(umaConta.calculaQuadrado(987),outraConta.calculaQuadrado(987),0.01);
        }
        
        @Test
        public void testCalculaQuadradoNegativoGrande() {
                assertEquals(umaConta.calculaQuadrado(-586.6),outraConta.calculaQuadrado(-586.7),0.01);
        }
        
        
        //Testar método calculoCubo

        @Test
        public void testCalculaCuboZero() {
                assertEquals(umaConta.calculaCubo(0),outraConta.calculaCubo(0),0.01);
        }
        
        @Test
        public void testCalculaCuboPositivoPequeno() {
                assertEquals(umaConta.calculaCubo(5),outraConta.calculaCubo(5),0.01);
        }
        
        @Test
        public void testCalculaCuboNegativoPequeno() {
                assertEquals(umaConta.calculaCubo(-5.5),outraConta.calculaCubo(-5.5),0.01);
        }
        
        @Test
        public void testCalculaCuboPositivoGrande() {
                assertEquals(umaConta.calculaCubo(87.3),outraConta.calculaCubo(87.3),0.01);
        }
        
        @Test
        public void testCalculaCuboNegativoGrande() {
                assertEquals(umaConta.calculaCubo(-98),outraConta.calculaCubo(-98),0.01);
        }
        
}
