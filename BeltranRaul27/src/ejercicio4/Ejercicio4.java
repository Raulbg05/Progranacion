/*
 * Descripción: Hacer nota media de las 4 notas que te dice el usuario, redondear y decir si es apto o no dependiendo de su nota
 * Autor: Raúl Beltrán
 * Fecha: 08/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4;
		
		System.out.print("Introduzca las siguientes notas (sobre 10): " + "\nNota 1: ");
		nota1 = teclado.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = teclado.nextDouble();
		System.out.print("Nota 3: ");
		nota3 = teclado.nextDouble();
		System.out.print("Nota 4: ");
		nota4 = teclado.nextDouble();

		double notaMedia = (nota1 + nota2 + nota3 + nota4) /4;
		double redondeo = (double) Math.round(notaMedia);
		double redondeoAlta = (double) Math.ceil(notaMedia);
		double redondeoBaja = (double) Math.floor(notaMedia);
		
		System.out.println("Su nota media es: " + notaMedia 
				+ "\nSu nota media redondeada es: " + redondeo
				+ "\nSu nota media redondeada hacia arriba es: " + redondeoAlta
				+ "\nSu nota media redondeada hacia abajo es: " + redondeoBaja);
		
		if (redondeo > 8 && redondeo < 10.1) {
			System.out.println("Puede acceder a los estudios superiores.");
		}
		
		else if (redondeo > 0 && redondeo <= 8) {
			System.out.println("La nota no es suficiente para acceder a los estudios superiores.");
		}
		
		else {
			System.out.println("nLa nota introducida es incorrecta.");
		}
		teclado.close();
	}

}
