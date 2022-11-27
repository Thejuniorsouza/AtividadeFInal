package task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTestUnit {
	
	Calculadora calculadora = new Calculadora();

	@Test
	void somarTeste() {
		assertEquals(4, calculadora.somar(2, 2));
	}
	
	@Test
	void subtrairTeste() {
		assertEquals(4, calculadora.subtrair(5, 1));
	}
	
	@Test
	void multiplicarTeste() {
		assertEquals(4, calculadora.multiplicar(2, 2));
	}
	
	@Test
	void dividirTeste() {
		assertEquals(4, calculadora.dividir(8, 2));
	}
	
	@Test
	void dividirErroTeste() {
		assertEquals(0, calculadora.dividir(8, 0));
	}
	
	@Test
	void exponencialTeste() {
		assertEquals(8, calculadora.exponencial(2, 3));
	}
	
	@Test
	void raizQuadradaTeste() {
		assertEquals(4, calculadora.raizQuadrada(16));
	}
	
	@Test
	void pisoTeste() {
		assertEquals(7, calculadora.piso(7.4));
	}
	
	@Test
	void tetoTeste() {
		assertEquals(8, calculadora.teto(7.4));
	}

}
