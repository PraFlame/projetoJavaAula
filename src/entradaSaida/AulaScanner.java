package entradaSaida;

import java.util.Scanner;

public class AulaScanner {

	public static void main(String[] args) {
		//Declaração de variáveis
		Scanner leia = new Scanner(System.in);
		String nome;
		
		//Entrada de dados.
		System.out.println("Escreva seu nome:");
		
		// Processamento de dados.
		nome = leia.nextLine();
		
		//Saída
		System.out.println("Bom dia, " +nome+".");	// "+" concatenar 

	}

}
