package estructurasSeleccion;

import java.util.Scanner;

public class Estructurasseleccion2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		System.out.print("Dime tu edad: ");
		numero = teclado.nextInt();
		
/*		if (numero > 0) {
			System.out.println("El número es positivo");			// SI EL NUMERO ES MAYOR QUE CERO MUESTRA ESTE MENSAJE Y SE ACABA AQUI EL PROGRAMA, SINO, SIGUE CON EL ELSE
		} 
		else 
		{
			if (numero == 0) {
				System.out.println("El número es 0");				// SI ES 0 MUESTRA ESTE MENSAJE, SINO, PASA AL SIGUIENTE ELSE
			} 
			else 
			{
				System.out.println("El número es negativo");		// SI NO ES NI MAYOR QUE CERO NI IGUAL A 0 MUESTRA FINALMENTE ESTE MENSAJE
			}
		}

*/	

		if (numero > 0) {
			System.out.println("El número es positivo");
			if (numero > 50)
				System.out.println("Además, el número es mayor que 50");
		} else {
			if (numero == 0) {
				System.out.println("El número es 0");
			} else {
				System.out.println("El número es negativo");
			}
		}
		
		
	}
}
