package tochoCaracteres;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TochoCadena {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		//CREAMOS EL PATRON
		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
		
		System.out.print("Introduce el DNI: ");
		String posibleDni = teclado.nextLine();

		// PREPARAMOS LA CADENA DE CARACTERES PARA COMPARAR
		Matcher texto = patron.matcher(posibleDni);
		
		// HACEMOS LA COMPARACION ONTENIENDO EL RESULTADO
		if (texto.matches()) {
			System.out.print("El DNI es correcto.");
		}
		
		else {
			System.out.print("El DNI es incorrecto.");
		}
	}

}
