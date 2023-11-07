package fr.esisar.calculatrice.operations.binaires;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;


public class MultiplierTest {


private final Multiplier multiplier = new Multiplier();
	
	@Test
	void shouldGetNomPlusSign() {
		assertEquals("*", multiplier.getNom());
	}
	
	@Test
	void NullResult1 () throws CalculatriceException {
		assertEquals(0.0, multiplier.calculer(-2.0, 0.0));
	}
	
	@Test
	void NullResult2 () throws CalculatriceException {
		assertEquals(0.0, multiplier.calculer(0.0, -2.0));
	}
	
	@Test
	void Positivenumbers () throws CalculatriceException {
		assertEquals(6.0, multiplier.calculer(3.0, 2.0));
	}
	
	@Test
	void Negativenumbers () throws CalculatriceException {
		assertEquals(6.0, multiplier.calculer(-3.0, -2.0));
	}
	@Test
	void NegativeResults1 () throws CalculatriceException {
		assertEquals(-6.0, multiplier.calculer(-3.0, 2.0));
	}
	@Test
	void NegativeResults2 () throws CalculatriceException {
		assertEquals(-6.0, multiplier.calculer(333333.0, 1110.0));
	}
	
	@Test
	void NullNumbers () throws CalculatriceException {
		assertEquals(0.0, multiplier.calculer(0.0, 0.0));
	}
	
	@Test
	void ThreePositiveArguments () throws CalculatriceException {
		assertDoesNotThrow(() -> multiplier.calculer(5.0, 1.0, 2.0));
	}
	
	@Test
	void ThreeNegativeArguments () throws CalculatriceException {
		assertDoesNotThrow(() -> multiplier.calculer(-5.0, -1.0, -2.0));
	}
	
}
