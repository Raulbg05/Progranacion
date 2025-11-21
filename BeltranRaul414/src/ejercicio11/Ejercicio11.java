/*
* Descripción: Programa que hace la tabla del número que ponga el usuario
* mediante una función
* Autor: Raúl Beltrán
* Fecha: 13/11/2025
*/
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
		int num;
		
		System.out.print("Introduce un número:");
		num = teclado.nextInt();
		
		System.out.println("La tabla del " + num + " es:");
		tabla(num);
		
	
	teclado.close();
	}
	
	// Hace la tabla de multiplicar del número introducido
	public static int tabla(int num) {
	int resultado = 0, contador = 0;
		for (int posicion = 0; posicion < 10; posicion++) {
			contador = contador + 1;
			System.out.println(num * contador);
		}
	return resultado;
	}
 
}
