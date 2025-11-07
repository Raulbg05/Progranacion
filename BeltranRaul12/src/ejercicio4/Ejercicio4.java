/*
 * Descripción: Uso de enumeraciones básicas
 * Autor: Raúl Beltrán
 * Fecha: 26/09/2025
 */
package ejercicio4;

public class Ejercicio4 {
	public enum Tamannios {pequeña, mediana, grande, extragrande};	// CREACION DE LA ENUMERACION, SE TIENE QUE PONER ANTES QUE --> public static void main(String[] args)
	
	
	public static void main(String[] args) {
		Tamannios medidaPequeña = Tamannios.pequeña;
		Tamannios medidaMediana = Tamannios.mediana;
		Tamannios medidaGrande = Tamannios.grande;
		Tamannios medidaExtragrande = Tamannios.extragrande;
		
		System.out.println("La hormiga es " + medidaPequeña + "\nLa pizza es " + medidaMediana + "\nLa casa es " + medidaGrande + "\nEsa camiseta es " + medidaExtragrande);

	}

}
