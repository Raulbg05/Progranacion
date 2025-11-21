/*
* Descripción: Programa que calcula la circunferencia, area y volumen 
* todo mediante funciones
* Autor: Raúl Beltrán
* Fecha: 21/11/2025
*/
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {	
		
	int opciOn;
	double radiO;
		
		opciOn = menu();
		radiO = pideRadio();
		
		if (opciOn == 1) {
			circunferencia(radiO);
		}
		else if (opciOn ==2) {
			area(radiO);
		}
		else if (opciOn == 3) {
			volumen(radiO);
		}
		else {
			circunferencia(radiO);
			area(radiO);
			volumen(radiO);
		}
		
	
	}
	// Muestra el menú y devuelve el número elegido
	public static int menu() {
		Scanner teclado= new Scanner(System.in);
		int opcion;
		
			System.out.print("Elige entre las 3 opciones:"
					 + "\n1. Circunferencia"
					 + "\n2. Area" 
					 + "\n3. Volumen" 
					 + "\n4. Todas" + "\n");
			opcion = teclado.nextInt();
			while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
				System.out.println("SOLO PUEDES ELEGIR ENTRE 1, 2, 3 o 4."
						+ "\nElige entre las 2 opciones:"
						 + "\n1. Circunferencia"
						+ "\n2. Area"
						+ "\n3. Volumen"
						+ "\n4. Todas" + "\n");
				opcion = teclado.nextInt();
			}
			
		return opcion;
	}
	// Pide que se introduzca el radio y lo devuelve
	public static double pideRadio() {
		Scanner teclado= new Scanner(System.in);
		double radio;
		
			System.out.print("Introduce el radio: ");
			radio = teclado.nextDouble();
			
		return radio;
	}
	// Calcula la circunferencia y la devuelve
	public static double circunferencia(double radio) {
		double circunferencia;
		
			circunferencia = 2 * Math.PI * radio;
			System.out.println("El valor de la circunferencia es: " + circunferencia);
			
		return circunferencia;
	}
	// Calcula el área y la devuelve
	public static double area(double radio) {
		double area;
		
			area = Math.PI * (radio * radio);
			System.out.println("El valor del area es: " + area);
			
		return area;
	}
	// Calcula el volumen y lo devuelve
	public static double volumen(double radio) {
		double volumen;
		
			volumen = ((4/3) * Math.PI) * (Math.pow(radio, 3));
			System.out.println("El valor del volumen es: " + volumen);
		
		return volumen;
	}
}
