/*
 * Descripción: Programa para hacer ficha de senderismo
 * Autor: Raúl Beltrán
 * Fecha: 16/10/2025
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		String nombre, apellidos, ciudad1, ciudad2, ciudad3, ciudad4, ciudad5;
		byte edad, rutasRealizadas;
		int distanciaRutaultima, distancia1 = 0, distancia2 = 0, distancia3 = 0, distancia4 = 0, distancia5 = 0, participantes1, participantes2, participantes3, participantes4, participantes5, distanciaLarga;
		double media;
		
		System.out.print("Introduzca los siguientes datos:" + "\nNombre: ");
		nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Edad: ");
		edad = teclado.nextByte();
			
				while (edad <17 || edad > 45) {
				System.out.print("Edad incorrecta, introducela de nuevo: ");
				edad = teclado.nextByte();
				}
		
		System.out.print("Número rutas realizadas: ");
		rutasRealizadas = teclado.nextByte();
		System.out.print("Distancia última ruta (km): ");
		distanciaRutaultima = teclado.nextInt();
		
		

			System.out.print("Introduzca los siguientes datos de sus últimas 5 caminatas: " + "\nRUTA 1:" + "\nDistancia: ");
			distancia1 = teclado.nextInt();
			System.out.print("Número de participantes: ");
			participantes1 = teclado.nextInt();
			
			teclado.nextLine();
			System.out.print("Ciudad: ");
			ciudad1 = teclado.nextLine();
			
			System.out.print("RUTA 2:" + "\nDistancia: ");
			distancia2 = teclado.nextInt();
			System.out.print("Número de participantes: ");
			participantes2 = teclado.nextInt();
			
			teclado.nextLine();
			System.out.print("Ciudad: ");
			ciudad2 = teclado.nextLine();
			
			System.out.print("RUTA 3:" + "\nDistancia: ");
			distancia3 = teclado.nextInt();
			System.out.print("Número de participantes: ");
			participantes3 = teclado.nextInt();
			
			teclado.nextLine();
			System.out.print("Ciudad: ");
			ciudad3 = teclado.nextLine();
			
			System.out.print("RUTA 4:" + "\nDistancia: ");
			distancia4 = teclado.nextInt();
			System.out.print("Número de participantes: ");
			participantes4 = teclado.nextInt();
			
			teclado.nextLine();
			System.out.print("Ciudad: ");
			ciudad4 = teclado.nextLine();
			
			System.out.print("RUTA 5:" + "\nDistancia: ");
			distancia5 = teclado.nextInt();
			System.out.print("Número de participantes: ");
			participantes5 = teclado.nextInt();
			
			teclado.nextLine();
			System.out.print("Ciudad: ");
			ciudad5 = teclado.nextLine();
			
			int guardado1 = distancia1, guardado2 = distancia2, guardado3 = distancia3, guardado4 = distancia4, guardado5 = distancia5;
			
			media = (distancia1 + distancia2 + distancia3 + distancia4 + distancia5) / 5;
			distanciaLarga = Math.max(distancia1, Math.max(distancia2, Math.max(distancia3, Math.max(distancia4, distancia5))));  // Uso el Math.max para calcular cual es la distancia mas larga de las introducidas
		
				if (distanciaLarga == guardado1) {
					
				System.out.print("--------------------------------------------------------" + 
				"\nNombre: " + nombre + 
				"\nEdad: " + edad + 
				"\nNúmero de rutas realizadas: " + rutasRealizadas + 
				"\n" + 
				"\nDistancia Media: " + media + 
				"\nDistancia más larga de las últimas 5 rutas: " + guardado1 +
				"\nCiudad de la ruta más larga: " + ciudad1 + 
				"\n--------------------------------------------------------");
				}
				
				else if (distanciaLarga == guardado2) {
				System.out.print("--------------------------------------------------------" + 
				"\nNombre: " + nombre + 
				"\nEdad: " + edad + 
				"\nNúmero de rutas realizadas: " + rutasRealizadas + 
				"\n" + 
				"\nDistancia Media: " + media + 
				"\nDistancia más larga de las últimas 5 rutas: " + guardado2 +
				"\nCiudad de la ruta más larga: " + ciudad2 + 
				"\n--------------------------------------------------------");					
				}
				
				else if (distanciaLarga == guardado3) {
				System.out.print("--------------------------------------------------------" + 
				"\nNombre: " + nombre + 
				"\nEdad: " + edad + 
				"\nNúmero de rutas realizadas: " + rutasRealizadas + 
				"\n" + 
				"\nDistancia Media: " + media + 
				"\nDistancia más larga de las últimas 5 rutas: " + guardado3 +
				"\nCiudad de la ruta más larga: " + ciudad3 + 
				"\n--------------------------------------------------------");					
				}
				
				else if (distanciaLarga == guardado4) {
				System.out.print("--------------------------------------------------------" + 
				"\nNombre: " + nombre + 
				"\nEdad: " + edad + 
				"\nNúmero de rutas realizadas: " + rutasRealizadas + 
				"\n" + 
				"\nDistancia Media: " + media + 
				"\nDistancia más larga de las últimas 5 rutas: " + guardado4 +
				"\nCiudad de la ruta más larga: " + ciudad4 + 
				"\n--------------------------------------------------------");					
				}
				
				else if (distanciaLarga == guardado5) {
				System.out.print("--------------------------------------------------------" + 
				"\nNombre: " + nombre + 
				"\nEdad: " + edad + 
				"\nNúmero de rutas realizadas: " + rutasRealizadas + 
				"\n" + 
				"\nDistancia Media: " + media + 
				"\nDistancia más larga de las últimas 5 rutas: " + guardado5 +
				"\nCiudad de la ruta más larga: " + ciudad5 + 
				"\n--------------------------------------------------------");					
				}
			
			teclado.close();
	}
}
