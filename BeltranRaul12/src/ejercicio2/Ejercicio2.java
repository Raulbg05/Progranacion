/*
 * Descripción: Solicitar datos a usuario darles salida
 * Autor: Raúl Beltrán
 * Fecha: 26/09/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuál es el nombre del equipo?");
		String nombreEquipo = teclado.nextLine();
		System.out.println("Cuál es el año de fundación del equipo?");
		short añoFundacion = teclado.nextShort();
		
		teclado.nextLine(); 												// ESTO SE PONE CUANDO PIDES PRIMERO UN NUMERO Y LUEGO PIDES CADENA DE CARACTERES (STRING)
		System.out.println("Cuál es el nombre del estadio del equipo?");
		String nombreEstadio = teclado.nextLine();
		System.out.println("Cuál es el nombre del capitán del equipo?");
		String nombreCapitan = teclado.nextLine();
		
		System.out.println("**********************************************************************************************" + "\n******* Nombre del equipo: " + nombreEquipo + " ***********************************************" + "\n******* Fundado en: " + añoFundacion + " ****************************************************************" + "\n******* Estadio: " + nombreEstadio + "****************************************************************** " + "\n***** Capitán: " + nombreCapitan + "*************************************************************");
		

	}

}
