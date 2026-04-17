package entradaSaida;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// Variaveis
		float grausC, grausF;
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Insira a temperatura em Célcios:");
		grausC = leia.nextFloat(); // Recebe número com ',' como 25,9 e não 25.9
		
		//Processamento
		grausF = grausC * 1.8f + 32;
		
		//Saída
		System.out.println("A temperatura em Fahrenheit é: " +grausF+".");
	}

}
