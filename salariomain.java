package ListaLucas;

import java.util.Scanner;

public class salariomain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float salario;
		
		System.out.println("Informe quanto você ganha por hora: ");

		float sH = entrada.nextFloat();
		
		System.out.println("Informe o número de horas trabalhadas: ");
		
		float hT = entrada.nextFloat();
		
		salario sal = new salario();
		
		float salariob = sal.bruto(sH, hT);
		
		System.out.println("Salario Bruto: " + salariob);
		
		salario = sal.INSS(sH, hT);
		
		System.out.println("Quantia paga ao INSS: " + salario);
		
		salario = sal.sindicato(sH, hT);
		
		System.out.println("Quantia paga ao sindicato: " + salario);
		
		salario = sal.liquid(sH, hT);
		
		System.out.println("Salario liquido: " + salario);
	
		entrada.close();
		
		
		
	}

}
