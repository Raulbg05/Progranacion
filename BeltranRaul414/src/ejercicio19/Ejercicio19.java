/*
* Descripción: Programa que comprueba si los 3 numeros insertados por teclado se ajustan a la ecuación de Pitágoras
 mediante una función.
* Autor: Raúl Beltrán
* Fecha: 19/11/2025
*/
package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
		int x,y,z;
		boolean result;
		
		System.out.print("Introduce el valor x: ");
		x = teclado.nextInt();
		System.out.print("Introduce el valor y: ");
		y = teclado.nextInt();
		System.out.print("Introduce el valor z: ");
		z = teclado.nextInt();
		
		result = ecuacionCorrecta(x,y,z);
		
		System.out.println("¿Es la ecuacuón correcta en este caso?" + "\n" + result);

	teclado.close();
	}
	// Funcion que comprueba si los numeros insertados se ajustan a la ecuación de Pitágoras
	public static boolean ecuacionCorrecta (int x, int y, int z) {
		boolean resultado;
			if ((z * z) == (x * x) + (y * y)) {
				resultado = true;
			}
			else {
				resultado = false;
			}
		return resultado;
	}

}
