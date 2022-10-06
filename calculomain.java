package ListaLucas;

import java.util.Scanner;

public class calculomain {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner (System.in);
        
        int resultado;
		
		System.out.println("Informe o primeiro número:");
		
		int num1 = entrada.nextInt();
		
		System.out.println("Informe o segundo número:");
		
		int num2 = entrada.nextInt();

        calculo resul = new calculo(); 
        
        resultado = resul.soma(num1, num2);
        
		System.out.println("A soma e: " + resultado);
		
		resultado = resul.menos(num1, num2);
		
		System.out.println("A subtração é: " + resultado);
		
        resultado = resul.multi(num1, num2);
		
		System.out.println("A multiplicação é: " + resultado);
		
        resultado = resul.div(num1, num2);
		
		System.out.println("A divisão é: " + resultado);
		
		entrada.close();


	}

}
