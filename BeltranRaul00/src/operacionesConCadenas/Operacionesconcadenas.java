package operacionesConCadenas;

import java.util.Scanner;

public class Operacionesconcadenas {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	
	System.out.print("Dime tu nombre: ");
	String nombre = teclado.nextLine();
	
	int tamanno = nombre.length();
	System.out.println("Número de carácteres del nombre: " + tamanno);

	String Primeraletra = nombre.substring(0, 1);			//Con esta línea meto la primera letra del nombre en una cadena de caracteres
	String May = Primeraletra.toUpperCase();				//Con esta convierto esa primera letra única a mayúscula
	String Finnombre = nombre.substring(1);
	System.out.print("Tu nombre con la primera letra en mayúscula es: " + (May+Finnombre));

	
	teclado.close();
	}

}
