/*
 * Descripción: Uso básico de while
 * Autor: Raúl Beltrán
 * Fecha: 09/10/2025
 */
package mientras;

import java.util.Scanner;

public class Mientras {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		int numero = teclado.nextInt();	
		
		int suma = numero;
		int contador = 1;
	
		
		while (numero != 0 && contador < 8) {						// Mientras el número sea distinto a 0 y el usuario ha introducido menos de 8 veces la operacion se hará, cuando una de las condiciones no se cumplan la operación parará
			System.out.print("Dame otro número: ");
			numero = teclado.nextInt();
			contador = contador + 1;								// contador
			suma = suma + numero; 									// acumulador
		}
		System.out.println("La suma es: " + suma);
	}

}
