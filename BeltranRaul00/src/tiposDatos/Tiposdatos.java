/*
 * Descripción: Tipos enumerados
 * Autor: Raúl Beltrán
 * Fecha: 26/09/2025
 */
package tiposDatos;

public class Tiposdatos {
	public enum Estaciones {OTOÑO, INVIERNO, PRIMAVERA, VERANO};
	
	
	public static void main(String[] args) {
		Estaciones estacionActual = Estaciones.OTOÑO;
		Estaciones estacionSiguiente = Estaciones.INVIERNO;
		
		System.out.println("ESTAMOS EN: " + estacionActual + "\nLA ESTACION QUE VIENE ES: " + estacionSiguiente);

	}

}
