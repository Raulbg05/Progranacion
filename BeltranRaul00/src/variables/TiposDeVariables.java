/*
 * Descripción: ejemplos de variables
 * Autor: Raúl Beltrán
 * Fecha: 23/09/2025
 */
package variables;

public class TiposDeVariables {

	public static void main(String[] args) {
		byte edadAlumno; // Declaración
		edadAlumno = 0; // Inicialización
		
		byte edadProfesor = 0; // Declaración e Inicialización
		
		System.out.println("Valor de la variable de alumno: " + edadAlumno);
		System.out.println("Valor de la variable profesor: " + edadProfesor);
		
		double alturaAlumno, pesoAlumno; // Declaración
		pesoAlumno = 92.5; // Inicialización
		alturaAlumno = 1.76; // Inicialización
		
		System.out.println("Peso: " + pesoAlumno + " Altura: " + alturaAlumno);
		
		pesoAlumno = 94;
		
		System.out.println("Peso: " + pesoAlumno + " Altura: " + alturaAlumno);
		
		char letraDni; // Declaración
		letraDni = 'B'; // Inicialización
		
		String nombreAlumno; // Declaración
		nombreAlumno = "Alberto"; // Inicialización
		
		boolean mayorEdad = false; // Declaración e Inicialización
				
		
		System.out.println("Letra del DNI: " + letraDni + " Nombre: " + nombreAlumno + " Mayor de edad: " + mayorEdad);
	}

}
