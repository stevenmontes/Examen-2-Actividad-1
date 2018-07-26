package cr.ac.cenfotec.clases.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.clases.CribaEratostenes;

public class CribaEratostenesTest {

	CribaEratostenes test = new CribaEratostenes();

	@Test
	public void testGenerarCribaDe10() {
		int[] resultadoEsperado = { 2, 3, 5, 7 };
		int[] resultadoObtenido = test.generaCriba(10);
		validarArreglo(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void testGenerarCribaConMinimo() {
		int[] resultadoEsperado = { 2, 3 };
		int[] resultadoObtenido = test.generaCriba(3);
		validarArreglo(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void testGenerarArregloBooleanosConMimino() {
		boolean[] resultadoEsperado = { false, false, true, true };
		boolean[] resultadoObtenido = test.validarNumerosPrimos(4);
		validarArreglo(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void testGenerarArregloBooleanosCon10() {
		boolean[] resultadoEsperado = { false, false, true, true, false, true, false, true, false, false, false };
		boolean[] resultadoObtenido = test.validarNumerosPrimos(11);
		validarArreglo(resultadoEsperado, resultadoObtenido);
	}

	private void validarArreglo(boolean[] resultadoEsperado, boolean[] resultadoObtenido) {
		for (int i = 0; i < resultadoEsperado.length; i++) {
			assertEquals(resultadoEsperado[i], resultadoObtenido[i]);
		}
	}

	private void validarArreglo(int[] resultadoEsperado, int[] resultadoObtenido) {
		for (int i = 0; i < resultadoEsperado.length; i++)
			assertEquals(resultadoEsperado[i], resultadoObtenido[i]);
	}

}
