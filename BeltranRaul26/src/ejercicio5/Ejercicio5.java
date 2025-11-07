/*
 * Descripción: Decir la nota Cualitativa de un alumno junto con su nombre, apellidos, ciclo formativo y Nota Cuantitativa
 * Autor: Raúl Beltrán
 * Fecha: 07/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		String nombre, apellidos, ciclo, notaCualitativa = "";
		int notaCuantitativa;
		
		System.out.print("Introduzca los siguientes valores: " + "\nNombre: ");
		nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Ciclo Formativo: ");
		ciclo = teclado.nextLine();
		System.out.print("Nota académica (entero): ");
		notaCuantitativa = teclado.nextInt();
		
			if (notaCuantitativa < 5) {
                notaCualitativa = " (Suspenso)";
            }
		
            else if (notaCuantitativa < 6) {
            	 notaCualitativa = " (Suficiente)";
            }
		
            else if (notaCuantitativa < 7) {
            	notaCualitativa = " (Bien)";
            }
		
            else if (notaCuantitativa < 9){
               notaCualitativa = " (Notable)"; 
            }
		
            else {
            	notaCualitativa = " (Sobresaliente)";
            }
		System.out.print("Nombre: " + nombre 
				+ "\nApellidos: " + apellidos 
				+ "\nCiclo Formativo: " + ciclo 
				+ "\nNota académica: " + notaCuantitativa + notaCualitativa);
		teclado.close();
	}

}
