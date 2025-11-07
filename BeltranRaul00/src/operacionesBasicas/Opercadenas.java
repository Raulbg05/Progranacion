/*
 * Descripción: Operaciones en cadena
 * Autor: Raúl Beltrán
 * Fecha: 26/09/2025
 */
package operacionesBasicas;

import java.util.Scanner;

public class Opercadenas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 								// AL PONER SCANNER TE PONES ENCIMA Y LE DAS A SCANNER UTIL; LO TIENES QUE PONER SIEMPRE QUE LE VAYAS A PEDIR AL PROGRAMA QUE INTRODUZCA RESPUESTAS
		
		System.out.print("Dime tu nombre: ");
		String nombre = teclado.nextLine(); 									// CON ESTO LE PIDES EL NOMBRE
		
		int longitud;
		longitud = nombre.length();  											// CON ESTE METODO SE CALCULA EL NUMERO DE LETRAS QUE TIENE LA PALABRA/PALABRAS QUE HAYA PUESTO ANTERIORMENTE (CUENTA LOS ESPACIOS COMO UNA LETRA MAS), TAMBIEN SE PUEDE ESCRIBIR ASI --> int longitud = nombre.length();
				
		System.out.println("Tu nombre tiene: " + longitud + " *carácteres*.");
		
		
		
		String nombreMinuscula = nombre.toLowerCase(); 							// ESTE METODO SE USA PARA CONVERTIR TODOS LOS CARACTERES QUE HAYA ESCRITO EL USUARIO A MINUSCULAS
		System.out.println("Tu nombre en minúscula es: " + nombreMinuscula);
		
		String nombreMayuscula = nombre.toUpperCase(); 							// ESTE METODO SE USA PARA CONVERTIR TODOS LOS CARACTERES QUE HAYA ESCRITO EL USUARIO A MAYUSCULAS
		System.out.println("Tu nombre en mayúscula es: " + nombreMayuscula); 	// PARA HACERLO EN UNA SOLA SENTENCIA SE PODRIA HACER ASI --> System.out.println("Tu nombre en mayúscula es: " + ombre.toUpperCase());
		
	}

}
