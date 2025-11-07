/*
 * Descripción: Decir la nota Cualitativa de un alumno indicando si es matricula de honor (10) junto con su nombre, apellidos, ciclo formativo y Nota Cuantitativa y si los datos no son correctos decirlo también
 * Autor: Raúl Beltrán
 * Fecha: 07/10/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

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
		
		
			if (notaCuantitativa <0 || notaCuantitativa > 10.1) {
			System.out.print("La nota académica indicada es incorrecta");
			} 
			
				else if (notaCuantitativa < 5) {
	                notaCualitativa = " (Suspenso)";
	        		
	                System.out.print("Nombre: " + nombre 
	        				+ "\nApellidos: " + apellidos 
	        				+ "\nCiclo Formativo: " + ciclo 
	        				+ "\nNota académica: " + notaCuantitativa + notaCualitativa);
	            }
			
	            else if (notaCuantitativa < 6) {
	            	 notaCualitativa = " (Suficiente)";
		        		
	            	 System.out.print("Nombre: " + nombre 
		        				+ "\nApellidos: " + apellidos 
		        				+ "\nCiclo Formativo: " + ciclo 
		        				+ "\nNota académica: " + notaCuantitativa + notaCualitativa);
	            }
			
	            else if (notaCuantitativa < 7) {
	            	notaCualitativa = " (Bien)";
	        		
	            	System.out.print("Nombre: " + nombre 
	        				+ "\nApellidos: " + apellidos 
	        				+ "\nCiclo Formativo: " + ciclo 
	        				+ "\nNota académica: " + notaCuantitativa + notaCualitativa);
	            }
			
	            else if (notaCuantitativa < 9){
	               notaCualitativa = " (Notable)"; 
	        		
	               System.out.print("Nombre: " + nombre 
	        				+ "\nApellidos: " + apellidos 
	        				+ "\nCiclo Formativo: " + ciclo 
	        				+ "\nNota académica: " + notaCuantitativa + notaCualitativa);
	            }
			
	            else if (notaCuantitativa < 10) {
	            	notaCualitativa = " (Sobresaliente)";
	        		
	            	System.out.print("Nombre: " + nombre 
	        				+ "\nApellidos: " + apellidos 
	        				+ "\nCiclo Formativo: " + ciclo 
	        				+ "\nNota académica: " + notaCuantitativa + notaCualitativa);
	            }
			
	            else {
	            	notaCualitativa = " (Matrícula de honor)";
	            	
	        		System.out.print("Nombre: " + nombre 
	        				+ "\nApellidos: " + apellidos 
	        				+ "\nCiclo Formativo: " + ciclo 
	        				+ "\nNota académica: " + notaCuantitativa + notaCualitativa);
	            }
		
		teclado.close();
	}

}