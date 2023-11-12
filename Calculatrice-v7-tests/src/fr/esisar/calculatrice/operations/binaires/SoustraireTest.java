package fr.esisar.calculatrice.operations.binaires;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;

public class SoustraireTest {
	
	private final Soustraire soustraire = new Soustraire();
	
	@Test
	void shouldGetNomMinusSign() {
		assertEquals("-", soustraire.getNom());
	}
	
	@Test
	void PositiveNumber () throws CalculatriceException {
		assertEquals(3.0, soustraire.calculer(5.0, 2.0));
	}
	
	@Test
	void NegativeNumber () throws CalculatriceException {
		assertEquals(1.0, soustraire.calculer(-1.0, -2.0));
	}
	
	@Test
	void NegativeResult () throws CalculatriceException {
		assertEquals(-1.0, soustraire.calculer(-3.0, -2.0));
	}
	
	@Test
	void NullResult () throws CalculatriceException {
		assertEquals(0.0, soustraire.calculer(-2.0, -2.0));
	}
	
	
	@Test
	void NullNumber () throws CalculatriceException {
		assertEquals(5.0, soustraire.calculer(5.0, 0.0));
	}
	
	@Test
	void NullNumber2 () throws CalculatriceException {
		assertEquals(1.0, soustraire.calculer(-1.0, -2.0));
	}
	
	@Test
	void PositiveNumbermoinsNullNumber () throws CalculatriceException {
		assertDoesNotThrow( () -> soustraire.calculer(5.0, 0.0));
	}
	
	@Test
	void NullNumbermoinsPositive () throws CalculatriceException {
		assertDoesNotThrow(() -> soustraire.calculer(0.0,5.0));
	}
	
	@Test
	void ThreePositiveArguments () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> soustraire.calculer(5.0, 1.0, 2.0));
	}
	
	@Test
	void ThreeNegativeArguments () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> soustraire.calculer(-5.0, -1.0, -2.0));
	}
	
	@Test
	void OnePositiveArgument () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> soustraire.calculer(5.0));
	}
	
	@Test
	void OneNegativeArgument () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> soustraire.calculer(-5.0));
	}
}
