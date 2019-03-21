package test.java.calculadora;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.calculadora.Soma;

public class SomaTest {

	public int valorX, valorY, resposta;
	
	@Before
	public void atribuiValores() {
		valorX = 5;
		valorY = 5;
		resposta = 10;
	}

	@After
	public void exibiValores() {
		Soma soma = new Soma();

		System.out.println("Esperado: "+valorX+" + "+valorY+" = "+resposta);
		System.out.println("Gerado: "+valorX+" + "+valorY+" = "+soma.calc(valorX, valorY));
		System.out.println("Esperado: "+valorY+" + "+valorX+" = "+resposta);
		System.out.println("Gerado: "+valorY+" + "+valorX+" = "+soma.calc(valorY, valorX));
	}

	@Test
	public void somarValorXcomValorY() {
		Soma soma = new Soma();

		assertEquals(resposta, soma.calc(valorX, valorY));
	}

	@Test
	public void somarValorYcomValorX() {
		Soma soma = new Soma();

		assertEquals(resposta, soma.calc(valorY, valorX));
	}

	
}
