/*
 * Descripción: Solicitar datos a usuario y darles salida
 * Autor: Raúl Beltrán
 * Fecha: 25/09/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 					// AL PONER SCANNER TE PONES ENCIMA Y LE DAS A SCANNER UTIL
		
		System.out.print("Introduce el nombre de usuario: ");
		String nombreUsuario = teclado.nextLine(); 					// CUANDO USAS STRING TIENES QUE PONER EL .NEXTLINE()
		System.out.print("Introduce los apellidos de usuario: ");
		String apellidosUsuario = teclado.nextLine();
		System.out.print("Introduce la dirección del usuario: ");
		String direccionUsuario = teclado.nextLine();
		System.out.print("Introduce la edad del usuario: ");
		byte edadUsuario = teclado.nextByte();						// RECUERDA PONER A CADA MEDIDA SU RESPECTIVA VARIABLE MAS OPTIMA (MIRA LA TAREA DE VARIABLES EN BeltranRaul00 PARA VERLAS TODAS)
		System.out.print("Introduce la altura del usuario: ");
		double alturaUsuario = teclado.nextDouble();				// RECUERDA PONER A CADA MEDIDA SU RESPECTIVA VARIABLE MAS OPTIMA (MIRA LA TAREA DE VARIABLES EN BeltranRaul00 PARA VERLAS TODAS)
		System.out.print("Introduce el peso del usuario: ");
		byte pesoUsuario = teclado.nextByte();
		
		System.out.println("Nombre: " + nombreUsuario + "\nApellidos: " + apellidosUsuario + "\nEdad: " + edadUsuario + "\nDirección: " + direccionUsuario + "\nAltura: " + alturaUsuario + "\nPeso: " + pesoUsuario);

	}

}
