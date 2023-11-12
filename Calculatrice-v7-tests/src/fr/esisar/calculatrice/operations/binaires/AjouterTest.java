package fr.esisar.calculatrice.operations.binaires;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;

public class AjouterTest {
	
	private final Ajouter ajouter = new Ajouter();
	
	@Test
	void shouldGetNomPlusSign() {
		assertEquals("+", ajouter.getNom());
	}
	
	@Test
	void PositiveNumber () throws CalculatriceException {
		assertEquals(3.0, ajouter.calculer(1.0, 2.0));
	}
	
	@Test
	void NegativeNumber () throws CalculatriceException {
		assertEquals(-3.0, ajouter.calculer(-1.0, -2.0));
	}
	
	@Test
	void NullResult () throws CalculatriceException {
		assertEquals(0.0, ajouter.calculer(2.0, -2.0));
	}
	
	@Test
	void NullNumber () throws CalculatriceException {
		assertDoesNotThrow(() -> ajouter.calculer(5.0, 0.0));
	}
	
	@Test
	void ThreePositiveArguments () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> ajouter.calculer(5.0, 1.0, 2.0));
	}
	
	@Test
	void ThreeNegativeArguments () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> ajouter.calculer(-5.0, -1.0, -2.0));
	}
	
	@Test
	void OnePositiveArgument () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> ajouter.calculer(5.0));
	}
	
	@Test
	void OneNegativeArgument () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> ajouter.calculer(-5.0));
	}

	
}
