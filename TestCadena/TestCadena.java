package TestCadena;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

class TestCadena {
	@Test
	void testEsMayuscula() {
		CadenaUtils c = new CadenaUtils("HOLA");
		assertTrue(c.estaEnMayusculas());
	}
	
	@Test
	void vacioNoMayuscula() {
		CadenaUtils c = new CadenaUtils("");
		assertFalse(c.estaEnMayusculas());
	}
	
	
	@Test
	void nullNoMayuscula() {
		CadenaUtils c = new CadenaUtils(null);
		assertNull(c.toMayusculas());
	}
	
	
	@Test
	void testEsMinuscula() {
		CadenaUtils c = new CadenaUtils("hola");
		assertTrue(c.estaEnMinusculas());
	}
	
	@Test
	void vacioNoMinuscula() {
		CadenaUtils c = new CadenaUtils("");
		assertFalse(c.estaEnMinusculas());
	}
	
	@Test
	void nullNoMinuscula() {
		CadenaUtils c = new CadenaUtils(null);
		assertNull(c.toMinusculas());
	}
	
	@Test
	void vacioNoCapicua() {
		CadenaUtils c = new CadenaUtils("");
		assertFalse(c.capicua());
	}
	
	@Test
	void testCapicua() {
		CadenaUtils c = new CadenaUtils("1234321");
		assertTrue(c.capicua());
	}
	
	@Test
	void vacioNoPalindroma() {
		CadenaUtils c = new CadenaUtils("");
		assertFalse(c.palindromo());
	}
	
	@Test
	void testPalindromo() {
		CadenaUtils c = new CadenaUtils("ana");
		assertTrue(c.palindromo());
	}
	
	@Test
	void testEsDecimal() {
		CadenaUtils c = new CadenaUtils("4.5");
		assertTrue(c.esDecimal());
	}
	
	@Test
	void VacioNoEsDecimal() {
		CadenaUtils c = new CadenaUtils("");
		assertFalse(c.esDecimal());
	}
	
	@Test
	void VacioNoEsEntero() {
		CadenaUtils c = new CadenaUtils("");
		assertFalse(c.esEntero());
	}
	
	@Test
	void testEsEntero() {
		CadenaUtils c = new CadenaUtils("55.6");
		assertFalse(c.esEntero());
	}
}
