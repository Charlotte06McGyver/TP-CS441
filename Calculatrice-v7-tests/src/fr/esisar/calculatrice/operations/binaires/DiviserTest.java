package fr.esisar.calculatrice.operations.binaires;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.esisar.calculatrice.CalculatriceException;


public class DiviserTest {

private final Diviser diviser = new Diviser();
	
	@Test
	void shouldGetNomDivSign() {
		assertEquals("/", diviser.getNom());
	}
	
	@Test
	void PositiveNumber () throws CalculatriceException {
		assertEquals(3.0, diviser.calculer(6.0, 2.0));
	}
	
	@Test
	void NegativeNumber () throws CalculatriceException {
		assertDoesNotThrow(() -> diviser.calculer(-6.0,-2.0));
	}
	
	@Test
	void Divideby1 () throws CalculatriceException {
		assertEquals(6.0,  diviser.calculer(6.0,1.0));
	}
	
	@Test
	void Divide1 () throws CalculatriceException {
		assertDoesNotThrow(() ->  diviser.calculer(1.0,2.0));
	}
	
	@Test
	void NullResult1 () throws CalculatriceException {
		assertEquals(0.0, diviser.calculer(0.0, -2.0));
	}
	
	@Test
	void NullResult2 () throws CalculatriceException {
		assertDoesNotThrow(() -> diviser.calculer(0.0, 2.0));
	}
	
	
	@Test
	void ThreePositiveArguments () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> diviser.calculer(5.0, 1.0, 2.0));
	}
	
	@Test
	void ThreeNegativeArguments () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> diviser.calculer(-5.0, -1.0, -2.0));
	}
	
	@Test
	void OnePositiveArgument () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> diviser.calculer(5.0));
	}
	
	@Test
	void OneNegativeArgument () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> diviser.calculer(-5.0));
	}
	
	@Test
	void ZeroNum () throws CalculatriceException {
		assertDoesNotThrow(() -> diviser.calculer(0.0, -5.0));
	}
	
	@Test
	void ZeroDenum () throws CalculatriceException {
		assertThrows(CalculatriceException.class, () -> diviser.calculer(5.0, 0.0));
	}
	
}
