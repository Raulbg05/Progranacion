/*
 * Descripción: Uso básico de "do" y "while"
 * Autor: Raúl Beltrán
 * Fecha: 10/10/2025
 */
package ejercicioBucles;

import java.util.Scanner;

public class Ejerciciobucles2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		int numero = teclado.nextInt();	
		
		int suma = numero;							//Almacenas el número en una variable diferente ya que luego le vamos a volver a pedir que ponga un número diferente
		int contador = 1;							//contador
		
		do {
			System.out.print("Dame otro número (0 para terminar): ");
			numero = teclado.nextInt();
			contador = contador + 1;				//Cuenta la cantidad de números que se suman
			suma = suma + numero;					//Suma el número original con el número que acaba de añadir
		} 
		while (numero != 0);						//Mientras el número sea diferente a 0, se hará la operación "do", en el momento en el que usuario ponga 0, saldrá el resultado final
		System.out.println("El resultado de la suma es: " + suma + " y has sumado un total de " + --contador + " números."); 		//Pongo contador con -- ya que si no lo haces cuenta el último numero (el 0) como número sumado
		teclado.close();
	}

}
