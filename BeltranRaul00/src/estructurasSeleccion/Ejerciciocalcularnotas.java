package estructurasSeleccion;

import java.util.Scanner;

public class Ejerciciocalcularnotas {

	public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
        
        double notaCuantitativa;
        
        System.out.print("Pon la nota del alumno: ");
        notaCuantitativa=teclado.nextDouble();
        
        if(notaCuantitativa> 0 && notaCuantitativa <= 10)
        {
            if ( notaCuantitativa < 5 )
            {
                System.out.println ("INSUFICIENTE");
            }
            else if ( notaCuantitativa < 6  )
            {
                System.out.println ("SUFICIENTE");
            }
            else if (  notaCuantitativa < 7  )
            {
                System.out.println  ("BIEN");
            }
            else if ( notaCuantitativa < 9 )
            {
                System.out.println  ("NOTABLE");
            }
            else 
            {
                System.out.println  ("SOBRESALIENTE");
            }
        }
        else
        {
            System.out.println ("La nota es incorrecta");
        }
        

        

    }

}