package ListaLucas;
import java.util.Scanner;

public class Numeromain {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o primeiro numero");
		
		int num1 = entrada.nextInt();
		
		System.out.println("Informe o segundo numero");
		
		int num2 = entrada.nextInt();
		
		numero intervalo = new numero(num1, num2);
		
		System.out.println("O intervalo e: " + intervalo);
		
		entrada.close();
		
		
		
		
	}

}
