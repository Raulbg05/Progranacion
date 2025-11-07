/*
 * Descripción: Programa gestor de matrículas de un gimnasio
 * Autor: Raúl Beltrán
 * Fecha: 29/10/2025
 */
package BeltranRaul;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	byte primeraOpcion, segundaOpcion = 0, ivaUno, ivaDos, ivaTres;
	double pvpFitness = 0, pvpYoga = 0, pvpMusculacion = 0, descuentoUno = 0, descuentoDos = 0, descuentoTres = 0, descuentoFinalUno = 0, descuentoFinalDos = 0, descuentoFinalTres = 0, matriculasFitness = 0, matriculasYoga = 0, matriculasMusculacion = 0, totalFitness = 0, totalYoga = 0, totalMusculacion = 0, totalMatriculas = 0;
	
	System.out.print("GESTIÓN DE UN GIMNASIO" 
	+ "\n----------------------------"
	+ "\nTIPOS DE MATRICULAS: 1. FITNESS - 2. YOGA - 3. MUSCULACIÓN"
	+ "\nPrecio de la matrícula tipo 1 (FITNESS): 10.0€"
	+ "\nPrecio de la matrícula tipo 1 (YOGA): 15.0€"
	+ "\nPrecio de la matrícula tipo 1 (MUSCULACIÓN): 20.0€"
	+ "\n" + "\n--- MENÚ DE OPCIONES ---"
	+ "\n1. Calcular PVP de cada matricula."
	+ "\n2. Aplicar oferta a un tipo de matrícula (sin iva)."
	+ "\n3. Calcular el importe total de matrículas realizadas (sin iva)."
	+ "\n4. Salir"
	+ "\nSeleccione una opción: ");
	primeraOpcion = teclado.nextByte();
	
	if (primeraOpcion == 1) {
	
		System.out.print("Ingrese el IVA para el tipo de matrícula 1 (4 - 10 - 21)");
		ivaUno = teclado.nextByte();

			if (ivaUno == 4) {
				pvpFitness = 10 + (10 * 0.04);
			}
			else if (ivaUno == 10) {
				pvpFitness = 10 + (10 * 0.1);
			}
			else if (ivaUno == 21) {
				pvpFitness = 15 + (15 * 0.21);
			}
			
		System.out.print("Ingrese el IVA para el tipo de matrícula 2 (4 - 10 - 21)");
		ivaDos = teclado.nextByte();
		
			if (ivaDos != 4 || ivaDos != 10 || ivaDos != 21) {
				System.out.print("El iva debe de ser una de estos tres opciones --> 4 - 10 - 21");
			}
			else if (ivaDos == 4) {
				pvpYoga = 15 + (15 * 0.04);
			}
			else if (ivaDos == 10) {
				pvpYoga = 15 + (15 * 0.1);
			}
			else if (ivaDos == 21) {
				pvpYoga = 15 + (15 * 0.21);
			}
			
		System.out.print("Ingrese el IVA para el tipo de matrícula 3 (4 - 10 - 21)");
		ivaTres = teclado.nextByte();
		
			if (ivaTres != 4 || ivaTres != 10 || ivaTres != 21) {
				System.out.print("El iva debe de ser una de estos tres opciones --> 4 - 10 - 21");
			}
			
			else if (ivaTres == 4) {
				pvpMusculacion = 15 + (15 * 0.04);
			}
			
			else if (ivaTres == 10) {
				pvpMusculacion = 15 + (15 * 0.1);
			}
			
			else if (ivaTres == 21) {
				pvpMusculacion = 15 + (15 * 0.21);
			}
	}
	
	else if (primeraOpcion == 2) {
		System.out.print("Seleccione un tipo de matrícula (1. Fitness, 2. Yoga o 3. Musculación): ");
		segundaOpcion = teclado.nextByte();
	
	do {
		System.out.print("Solo puedes escoger --> (1. Fitness, 2. Yoga o 3. Musculación), cualquier otro número no será válido");
		segundaOpcion = teclado.nextByte();
	} while (segundaOpcion != 1 || segundaOpcion != 2 || segundaOpcion != 3);
	
	if (segundaOpcion == 1) {
		System.out.print("Introduzca el descuento que desees hacer: ");
		descuentoUno = teclado.nextDouble();
		descuentoFinalUno = 10 - (10 * (descuentoUno / 100));
		System.out.print("El precio final (sin iva) con descuento para el tipo de matrícula 1 es: " + descuentoFinalUno);
		}
	
	else if (segundaOpcion == 2) {
		System.out.print("Introduzca el descuento que desees hacer: ");
		descuentoDos = teclado.nextDouble();
		descuentoFinalDos = 15 - (15 * (descuentoDos / 100));
		System.out.print("El precio final (sin iva) con descuento para el tipo de matrícula 2 es: " + descuentoFinalDos);
		}
	
	else if (segundaOpcion == 3) {
		System.out.print("Introduzca el descuento que desees hacer: ");
		descuentoTres = teclado.nextDouble();
		descuentoFinalTres = 15 - (15 * (descuentoTres / 100));
		System.out.print("El precio final (sin iva) con descuento para el tipo de matrícula 2 es: " + descuentoFinalTres);
	}
	}
	else if (primeraOpcion == 3) {
		System.out.print("Ingrese las matrículas realizadas para el tipo de matrícula 1 (Fitness): ");
		matriculasFitness = teclado.nextDouble();
		totalFitness = matriculasFitness * 10;
		System.out.print("Ingrese las matrículas realizadas para el tipo de matrícula 2 (Yoga): ");
		matriculasYoga = teclado.nextDouble();
		totalYoga = matriculasYoga * 15;
		System.out.print("Ingrese las matrículas realizadas para el tipo de matrícula 3 (Musculacion): ");
		matriculasMusculacion = teclado.nextDouble();
		totalMusculacion = matriculasMusculacion * 20;
		
		totalMatriculas = totalFitness + totalYoga + totalMusculacion;
		System.out.print("\n" + "\n" + "El importe total (sin iva) de las matriculas realizadas es: " + totalMatriculas);
	}
	else if (primeraOpcion == 4) {
		System.out.print("Saliendo del programa...");
	}
	
	teclado.close();
		
	}
}


