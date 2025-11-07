/*
 * Descripción: Programa que ayudará a un equipo de Recursos Humanos a realizar una  serie de entrevistas al usuario
 * Autor: Raúl Beltrán
 * Fecha: 08/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		String nombre, apellidos;
		int edad, annoExp, proyectos;
		double salarioDeseado;
		
		System.out.print("Introduzca los siguientes valores: " + "\nNombre: ");
		nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Edad: ");
		edad = teclado.nextInt();
		System.out.print("Salario Deseado (Euros): ");
		salarioDeseado = teclado.nextDouble();
		
		if (edad > 45 || salarioDeseado > 30000) {
			System.out.print("Lo sentimos pero no cumple nuestro perfil");
		} 
		
		else {
			System.out.print("Introduzca sus años de experiencia: ");
			annoExp = teclado.nextInt();
			System.out.print("Introduzca su número de proyectos trabajados anteriormente: ");
			proyectos = teclado.nextInt();
			if (annoExp > 2 && proyectos > 3) {
				System.out.print("Enhorabuena. Ha sido contratado");
			} 
			
				else {
					System.out.print("Lo sentimos pero no cumple nuestro perfil");
			}
		}
		teclado.close();
	}

}
