package objetosTOCHO;

import java.awt.Rectangle;

public class ObjetosTOCHO {

	public static void main(String[] args) {
		Rectangle r1; // Declaración, le doy doble clic para importar el paquete de java.awt (lo puedes ver arriba)
		
		r1 = new Rectangle();
		System.out.println(r1.toString());
		
		r1.x = 10;
		System.out.println(r1.toString());
		
		Rectangle r2;
		
		r2 = r1;
		System.out.println(r2.toString());
		
		r2.y = 5;
		System.out.println(r1.toString());
	}

}
