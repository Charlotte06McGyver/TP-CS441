package fr.esisar.calculatrice.operations.ensemblistes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;

public class MaximumTest {
	
private final Maximum maximum = new Maximum();
	
	@Test
	void shouldGetNomPlusSign() {
		assertEquals("max", maximum.getNom());
	}

	
	@Test
	void Negativenumbers () throws CalculatriceException {
		assertEquals(-2.0, maximum.calculer(-3.0, -2.0));
	}
	
	@Test
	void Positivenumbers () throws CalculatriceException {
		assertEquals(3.0, maximum.calculer(3.0, 2.0));
	}
	
	@Test
	void DifferentSign1 () throws CalculatriceException {
		assertEquals(3.0, maximum.calculer(3.0, -2.0));
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
	
}
