package fr.esisar.calculatrice.operations.ensemblistes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;

public class MaximumTest {
	
private final Maximum maximum = new Maximum();
	
	@Test
	void shouldGetNomMaxSign() {
		assertEquals("max", maximum.getNom());
	}

	
	@Test
	void Negativenumbers () throws CalculatriceException {
		assertEquals(-1.0, maximum.calculer(-3.0, -2.0, -1.0));
	}
	
	@Test
	void Positivenumbers () throws CalculatriceException {
		assertEquals(3.0, maximum.calculer(3.0, 2.0, 1.0));
	}
	
	@Test
	void DifferentSign1 () throws CalculatriceException {
		assertEquals(3.0, maximum.calculer(3.0, -2.0, 1.0));
	}
	
	@Test
	void DifferentSign2 () throws CalculatriceException {
		assertEquals(2.0, maximum.calculer(-3.0, 2.0));
	}
	@Test
	void Null1() throws CalculatriceException {
		assertEquals(2.0, maximum.calculer(0.0, 2.0));
	}
	@Test
	void Null2() throws CalculatriceException {
		assertEquals(2.0, maximum.calculer(2.0, 0.0));	
	}
	@Test
	void Null3() throws CalculatriceException {
		assertEquals(0.0, maximum.calculer(-2.0, 0.0));	
	}
	@Test
	void Null4() throws CalculatriceException {
		assertEquals(0.0, maximum.calculer(0.0,-2.0));	
	}
	@Test
	void Null5() throws CalculatriceException {
		assertEquals(0.0, maximum.calculer(0.0, 0.0));	
	}
	@Test
	void EqualPositive () throws CalculatriceException {
		assertEquals(3.0, maximum.calculer(3.0, 3.0));
	}
	@Test
	void EqualNegative () throws CalculatriceException {
		assertEquals(-3.0, maximum.calculer(-3.0, -3.0));
	}
	
	@Test
	void FiveArguments () throws CalculatriceException {
		assertEquals(25.0, maximum.calculer(2.0, 5.0, 8.0, 4.0, 25.0));
	}
	
	@Test
	void OneArgument () throws CalculatriceException {
		assertEquals(25.0, maximum.calculer(25.0));
	}
	
}
