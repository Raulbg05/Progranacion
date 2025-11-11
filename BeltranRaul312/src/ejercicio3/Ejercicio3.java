/*
*  Descripción: Programa que genera un nombre de usuario
*  con las 3 primeras letras de tu nombre y apellidos
 * Autor: Raúl Beltrán
 * Fecha: 07/11/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	int inicioPalabra = 0, finPalabra, lugar = 0;
	String Completo = "";
    String[] palabra = new String [3];
    
    System.out.print("Introduce tu nombre y dos apellidos: ");
	Completo = teclado.nextLine();

		// Este bucle mete cada palabra del nombre completo en diferentes posiciones de un Vector
		for (int posicion = 0; posicion <= Completo.length(); posicion++) {
			if (posicion == Completo.length() || Completo.charAt(posicion) == ' ') {			
					finPalabra = posicion;
					palabra[lugar] = Completo.substring(inicioPalabra, finPalabra);
					lugar++;
					inicioPalabra = posicion + 1;
				
			}
		}
	// Creo las cadenas de caracteres y les doy el valor correspondiente de la posicon en la que se encuentran en el Vector
	String nombre = palabra[0];
	String apellido = palabra[1];
	String apellido1 = palabra[2];
	
	// Pillo las 3 primeras letras del nombre y las combierto en mayuscula
	String Nombre3 = nombre.substring(0, 3);
	String Mayus = Nombre3.toUpperCase();
	
	// Pillo las 3 primeras letras del primer apellido y las combierto en mayuscula
	String Apellido3 = apellido.substring(0, 3);
	String Mayus1 = Apellido3.toUpperCase();
	
	// Pillo las 3 primeras letras del segundo apellido y las combierto en mayuscula
	String Apellido13 = apellido1.substring(0, 3);
	String Mayus2 = Apellido13.toUpperCase();
	
	
	System.out.print("Tu nombre de usuario es: " + (Mayus + Mayus1 + Mayus2));
	
	
	teclado.close();
	}

}
