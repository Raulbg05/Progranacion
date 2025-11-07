/*
 * Descripción: Decir la calificación correspondiente usando switch
 * Autor: Raúl Beltrán
 * Fecha: 08/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Introduzca tu nota (valor entero): ");
		int nota = teclado.nextInt();

		String resultado;
			
				switch (nota) {
				case 0,1,2,3,4:
					resultado = "INSUFICIENTE";
					break;
				case 5:
					resultado = "SUFICIENTE";
					break;
				case 6:
					resultado = "BIEN";
					break;
				case 7,8:
					resultado = "NOTABLE";
					break;
				case 9,10:
					resultado = "SOBRESALEINTE";
					break;
				default:
					resultado = "La nota es incorrecta";
				}
		System.out.print("Tu nota es " + resultado + ", un " + nota);
		teclado.close();
	}

}


	


