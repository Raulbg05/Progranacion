/*
* Descripción: Programa calcula el perímetro y área de un rectángulo con alto y ancho dados por el usuario
* utilizando una función
* Autor: Raúl Beltrán
* Fecha: 11/11/2025
*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
		double ancho, alto, resultadoArea, resultadoPerimetro;
		
		System.out.print("Introduce el ancho de un rectángulo (m): ");
		ancho = teclado.nextDouble();
		
		System.out.print("Introduce el alto de un rectángulo (m): ");
		alto = teclado.nextDouble();
		
		resultadoPerimetro = perimetroRectangulo (ancho, alto);
		resultadoArea = areaRectangulo (ancho, alto);
		
		System.out.print("El perimetro del rectángulo es: " + resultadoPerimetro + " metros."
				+ "\nEl área del rectángulo es: " + resultadoArea + " metros cuadrados.");
	
	teclado.close();
	}
	
	// Devuelve el perímetro
	public static double perimetroRectangulo(double ancho, double alto) {
		double perimetro;
			perimetro = 2 * (ancho + alto);
	return perimetro;
	}
	
	// Devuelve el área
	public static double areaRectangulo(double ancho, double alto) {
		double area;
			area = ancho * alto;
	return area;
	}

}
