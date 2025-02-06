package prueba;

import java.util.HashMap;
import java.util.Map;

public class Prueba {

// Método para contar el número de palabras en una cadena
public static int contarPalabras(String str) {
if (str == null || str.isEmpty()) {
return 0;
}
String[] palabras = str.split("\\s+");
return palabras.length;
}

// Método para contar el número de letras diferentes en una cadena
public static int contarLetrasDiferentes(String str) {
if (str == null || str.isEmpty()) {
return 0;
}
str = str.toLowerCase().replaceAll("[^a-z]", "");
return (int) str.chars().distinct().count();
}

// Método para contar las veces que aparece cada palabra en una cadena
public static Map<String, Integer> contarFrecuenciaPalabras(String str) {
Map<String, Integer> frecuenciaPalabras = new HashMap<>();
if (str == null || str.isEmpty()) {
return frecuenciaPalabras;
}
String[] palabras = str.toLowerCase().split("\\s+");
for (String palabra : palabras) {
frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
}
return frecuenciaPalabras;
}

// Método para contar las veces que aparece cada letra en una cadena
public static Map<Character, Integer> contarFrecuenciaLetras(String str) {
Map<Character, Integer> frecuenciaLetras = new HashMap<>();
if (str == null || str.isEmpty()) {
return frecuenciaLetras;
}
str = str.toLowerCase().replaceAll("[^a-z]", "");
for (char c : str.toCharArray()) {
frecuenciaLetras.put(c, frecuenciaLetras.getOrDefault(c, 0) + 1);
}
return frecuenciaLetras;
}

// Método para verificar si una palabra es palíndroma
public static boolean esPalindroma(String palabra) {
if (palabra == null || palabra.isEmpty()) {
return false;
}
palabra = palabra.toLowerCase().replaceAll("[^a-z]", "");
int izquierda = 0;
int derecha = palabra.length() - 1;
while (izquierda < derecha) {
if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
return false;
}
izquierda++;
derecha--;
}
return true;
}

 
}