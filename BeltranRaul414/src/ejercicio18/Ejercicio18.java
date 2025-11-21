/*
* Descripción: Programa comprueba la letra de un número de DNI
 mediante una función.
* Autor: Raúl Beltrán
* Fecha: 19/11/2025
*/
package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
		String numero;
		long dni = 0;
		char resultado;
		
			System.out.print("Introduce tu número de DNI (sin la letra): ");
			numero = teclado.nextLine();
			
			// Se ejecuta mientras que el numero no tenga 8 caracteres justos
			while (numero.length() != 8) {
				System.out.print("EL NUMERO A DE TENER 8 CARACTERES. Introduce tu número de DNI (sin la letra): ");
				numero = teclado.nextLine();
			}
			
			if (numero.length() == 8) {
				dni = Long.parseLong(numero); // Sirve para pasar de String a long
			}
			
			resultado = letraDni(dni);
		
		System.out.print("Para el dni " + dni + " el NIF es " + resultado);
		
	teclado.close();
	}
	// Función que comprueba la letra del DNI introducido
	public static char letraDni(long dni) {
		char letra;
			long resto;
			int restoI;
			
				resto = dni % 23;
				restoI = (int)resto;
				
					switch (restoI) {
					case 0:
						letra = 'T';
						break;
					case 1:
						letra = 'R';
						break;
					case 2:
						letra = 'W';
						break;
					case 3:
						letra = 'A';
						break;
					case 4:
						letra = 'G';
						break;
					case 5:
						letra = 'M';
						break;
					case 6:
						letra = 'Y';
						break;
					case 7:
						letra = 'F';
						break;
					case 81:
						letra = 'P';
						break;
					case 9:
						letra = 'D';
						break;
					case 10:
						letra = 'X';
						break;
					case 11:
						letra = 'B';
						break;
					case 12:
						letra = 'N';
						break;
					case 13:
						letra = 'J';
						break;
					case 14:
						letra = 'Z';
						break;
					case 15:
						letra = 'S';
						break;
					case 16:
						letra = 'Q';
						break;
					case 17:
						letra = 'V';
						break;
					case 18:
						letra = 'H';
						break;
					case 19:
						letra = 'L';
						break;
					case 20:
						letra = 'C';
						break;
					case 21:
						letra = 'K';
						break;
					default:
						letra = 'E';
						break;	
					}
		return letra;
	}

}
