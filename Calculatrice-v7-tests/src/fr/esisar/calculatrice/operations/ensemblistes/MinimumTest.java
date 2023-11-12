package fr.esisar.calculatrice.operations.ensemblistes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;


public class MinimumTest {
	
private final Minimum minimum = new Minimum();
	
	@Test
	void shouldGetNomMinSign() {
		assertEquals("min", minimum.getNom());
	}
	
	@Test
	void Negativenumbers () throws CalculatriceException {
		assertEquals(-3.0, minimum.calculer(-3.0, -2.0, -1.0));
	}
	
	@Test
	void Positivenumbers () throws CalculatriceException {
		assertEquals(2.0, minimum.calculer(3.0, 2.0, 4.0));
	}
	
	@Test
	void DifferentSign1 () throws CalculatriceException {
		assertEquals(-2.0, minimum.calculer(3.0, -2.0));
	}
	
	@Test
	void DifferentSign2 () throws CalculatriceException {
		assertEquals(-3.0, minimum.calculer(-3.0, 2.0));
	}
	@Test
	void Null1() throws CalculatriceException {
		assertEquals(0.0, minimum.calculer(0.0, 2.0));
	}
	@Test
	void Null2() throws CalculatriceException {
		assertEquals(0.0, minimum.calculer(2.0, 0.0));	
	}
	@Test
	void Null3() throws CalculatriceException {
		assertEquals(-2.0, minimum.calculer(-2.0, 0.0));	
	}
	@Test
	void Null4() throws CalculatriceException {
		assertEquals(-2.0, minimum.calculer(0.0,-2.0));	
	}
	@Test
	void Null5() throws CalculatriceException {
		assertEquals(0.0, minimum.calculer(0.0, 0.0));	
	}
	@Test
	void EqualPositive () throws CalculatriceException {
		assertEquals(3.0, minimum.calculer(3.0, 3.0));
	}
	@Test
	void EqualNegative () throws CalculatriceException {
		assertEquals(-3.0, minimum.calculer(-3.0, -3.0));
	}
	
	@Test
	void FiveArguments () throws CalculatriceException {
		assertEquals(2.0, minimum.calculer(2.0, 5.0, 8.0, 4.0, 25.0));
	}
	
	@Test
	void FiveArgumentsDesordre () throws CalculatriceException {
		assertEquals(2.0, minimum.calculer(8.0, 5.0, 2.0, 4.0, 25.0));
	}
	
	@Test
	void FiveArgumentsDesordre2 () throws CalculatriceException {
		assertEquals(2.0, minimum.calculer(8.0, 5.0, 4.0, 2.0, 25.0));
	}
	
	@Test
	void OneArgument () throws CalculatriceException {
		assertEquals(25.0, minimum.calculer(25.0));
	}

}
