/*
 * Descripción: Dar a elegir al usuario entre varias posibles operaciones según el número que elija
 * Autor: Raúl Beltrán
 * Fecha: 08/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		double num1, num2, suma, resta, multiplicacion, division;
		int numero;
		
		System.out.print("Introduzca el valor1: ");
		num1 = teclado.nextDouble();
		System.out.print("Introduzca el valor2: ");
		num2 = teclado.nextDouble();
		
		System.out.print("Operaciones posible a realizar:" 
		+ "\n(1) Suma" 
		+ "\n(2) Resta" 
		+ "\n(3) Multiplicación" 
		+ "\n(4) División" 
		+ "\nInserte el número de operación que quiera realizar: ");
		numero = teclado.nextInt();
		
		System.out.println("--------------");
		
		
		if (numero < 1 && numero > 4) {
			System.out.print("El número introducido no corresponde a ninguna operación.");
		}
		
		else if (numero == 1) {
			suma = num1 + num2;
			System.out.print("Resultado: " + suma);
		}
		
		else if (numero == 2) {
			resta = num1 - num2;
			System.out.print("Resultado: " + resta);
		}
		
		else if (numero == 3) {
			multiplicacion = num1 * num2;
			System.out.print("Resultado: " + multiplicacion);
		}
		
		else if (numero == 4) {
			division = num1 / num2;
			System.out.print("Resultado: " + division);
		}
		teclado.close();
	}

}
