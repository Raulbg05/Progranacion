package ejercicioArrays;

public class Ejercicioarrays1 {

	public static void main(String[] args) {
		
		final int TOTAL_NUM = 20;						// El final int es una variable constante que siempre hay que poner arriba de la instanciación del array
		
		int[] numeros; 									//Declaración del array, se ponen los corchetes para diferenciar los arrays de las declaraciones de variables normales
		numeros = new int[TOTAL_NUM]; 					// Instanciación del array

		
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			int aleatorio = (int) (Math.random() * 51);	// Math.random() genera un número entre 0.0 y 1.0;  Al multiplicar por 51, se obtiene un rango entre 0 y 50; El (int) elimina los decimales
			numeros[posicion] = aleatorio; 				// Con  esta línea se iniciarían cada array con un valor aleatorio entre 0 y 50, ya que el bucle le va poniendo a cada variable de números el valor 0.
		}
		
		for (int posicion = 0; posicion < TOTAL_NUM; posicion++) {
			System.out.println("El valor que hay en la posición " + posicion + " es " + numeros[posicion]);
		}
	}

}
