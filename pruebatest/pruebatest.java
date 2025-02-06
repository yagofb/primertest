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
	void contarPalabras2() {
		assertNotEquals(5,Prueba.contarPalabras("Esto tiene unas 3 palabras"));
		
	}
	
	@Test
	@DisplayName("Se cuentan las letras que son diferentes")
	void contarLetras() {
		assertEquals(5,Prueba.contarLetrasDiferentes("Superfragilistrico"));
		
	}
	
	
	@Test
	@DisplayName("Se cuentan las letras con espacio")
	void contarLetras2() {
		assertNotEquals(5,Prueba.contarPalabras("Superfragilistrico"));
		
	}
	
	
}
