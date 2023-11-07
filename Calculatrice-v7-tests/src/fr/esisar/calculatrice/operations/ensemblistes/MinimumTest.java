package fr.esisar.calculatrice.operations.ensemblistes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class MinimumTest {
	
private final Minimum minimum = new Minimum();
	
	@Test
	void shouldGetNomPlusSign() {
		assertEquals("min", minimum.getNom());
	}


}
