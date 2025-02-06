package pruebatest;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import prueba.Prueba;


class PruebasTest extends Prueba {

	@Test
	@DisplayName("Contar palabras bien")
	void contarPalabras() {
		assertEquals(5,Prueba.contarPalabras("Hay cinco palabras"));
	
	}
	@Test
	@DisplayName("Contar las palabras con espacio")
	void palabrasespacio() {
		 assert
		
	}
	
	
	
	
	
}
