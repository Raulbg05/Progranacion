/*
* Descripción: Programa que hace una pirámide con el carácter que introduzca el usuario
* mediante una función
* Autor: Raúl Beltrán
* Fecha: 18/11/2025
*/
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
		
		String Texto;
		char letra;
		int veces;
			
		System.out.print("Introduce el caracter que quieres que salga en la pirámide (sólo contará el primer carácter):");
		Texto = teclado.nextLine();
			
		letra = Texto.charAt(0);
			
		System.out.print("Introduce el número de líneas que tendrá el triángulo:");
		veces = teclado.nextInt();
			
		triangulo(letra, veces);
		
	teclado.close();
	}
	// Dibuja una pirámide centrada usando un carácter y un número de líneas
	public static void triangulo(char letra, int veces) {

	    int cantidad = 1;              // Cantidad de caracteres que tendrá la línea actual (empieza en 1)
	    int contadorEspacios = veces;  // Número de espacios iniciales para centrar la pirámide

	    // Bucle que controla cuántas líneas tiene la pirámide
	    for (int posicion = 0; posicion < veces; posicion++) {
	        
	        // Imprime los espacios a la izquierda para centrar cada fila
	        for (int a = 0; a < contadorEspacios; a++) {
	            System.out.print(" ");
	        }

		        // Imprime los caracteres de la pirámide en la línea actual
		        for (int lugar = 0; lugar < cantidad; lugar++) {
		            System.out.print(letra);
		        }

		 System.out.println();  // Salto de línea para pasar a la siguiente fila

	     cantidad += 2;         // La siguiente fila tendrá 2 caracteres más (forma de pirámide)
	     contadorEspacios--;    // Cada fila tendrá un espacio menos a la izquierda
	    }
	}

}
