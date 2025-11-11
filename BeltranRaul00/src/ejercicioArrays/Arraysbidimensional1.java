/*
 * 
 */
package ejercicioArrays;

public class Arraysbidimensional1 {

	public static void main(String[] args) {
		
		  int[][] temperatura;  //Declaracion
	        temperatura= new int[30][12];   // Instanciación
	        int temperaturaMax,temperaturaMin,aplitudTermica;
	        
	        for(int dia=0;dia<30;dia++)
	        {
	            for(int mes=0; mes<12; mes++)
	            {
	                temperatura[dia][mes]=(int)(Math.random()*50);
	                
	            }
	            
	        }
	        
	        
	        for(int mes=0; mes<12; mes++)
	        {
	            temperaturaMax=temperatura[0][mes];
	            temperaturaMin=temperatura[0][mes];
	            for(int dia=0;dia<30;dia++)
	            {
	                System.out.print(temperatura[dia][mes]+ "\t");
	                if(temperaturaMax<temperatura[dia][mes])
	                {
	                    temperaturaMax=temperatura[dia][mes];
	                    
	                }
	                if(temperaturaMin>temperatura[dia][mes])
	                {
	                    temperaturaMin=temperatura[dia][mes];
	                    
	                }
	            }
	            aplitudTermica=temperaturaMax-temperaturaMin;
	            System.out.println("-------------------------------------------------------");
	            System.out.println("\n" + "La maxima temperatura del mes "+(mes+1)+": "+ temperaturaMax);
	            System.out.println("La minima temperatura del mes "+(mes+1)+": "+ temperaturaMin);
	            System.out.println("La aplitud termica del mes "+(mes+1)+": "+ aplitudTermica);
	            System.out.println("-------------------------------------------------------");
	        
	            
	        }
	        
	    }

}
