package ListaLucas;

import java.util.Scanner;

public class quadradomain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int t = entrada.nextInt();
		
		for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t; j++) {
            	
                if (i == 1 || i == t || j == 1 || j == t)
                	
                    System.out.print("+ ");
                
                else
                	
                    System.out.print("  ");
            }
            
            System.out.print("\n");
            
		}
		
		quadrado fun = new quadrado();
		
		int area = fun.area(t);
		
		System.out.println("");
		
		System.out.println("Area: " + area);
		
		entrada.close();
		


			
		

	}

}
