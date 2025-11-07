/*
 * Descripción: Peticiones de datos usando "scanner"
 * Autor: Raúl Beltrán
 * Fecha: 24/09/2025
 */
package entradaDatos;

import java.util.Scanner;

public class Peticiondatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);						 	// AL PONER SCANNER TE PONES ENCIMA Y LE DAS A SCANNER UTIL; LO TIENES QUE PONER SIEMPRE QUE LE VAYAS A PEDIR AL PROGRAMA QUE INTRODUZCA RESPUESTAS
		System.out.print("Dame la edad del alumno: ");
		byte edadAlumno;
		edadAlumno = teclado.nextByte(); 									// RECUERDA PONER A CADA MEDIDA SU RESPECTIVA VARIABLE MAS OPTIMA (MIRA LA TAREA DE VARIABLES EN BeltranRaul00 PARA VERLAS TODAS)
		System.out.println("La edad del alumno es: " + edadAlumno);
		
		teclado.nextLine(); 												// ESTO SE PONE CUANDO PIDES PRIMERO UN NUMERO Y LUEGO PIDES CADENA DE CARACTERES (STRING)
		System.out.print("Dame el nombre del alumno: ");
		String nombreAlumno = teclado.nextLine();
		System.out.println("El nombre del alumno es: " + nombreAlumno);
		
		System.out.print("Dame la altura del alumno: ");
		float alturaAlumno = teclado.nextFloat();
		System.out.println("La altura del alumno es: " + alturaAlumno);
		
	}

}
