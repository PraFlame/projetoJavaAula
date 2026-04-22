package lacoCondicional;

import java.util.Scanner;

public class exemploIF {

	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		int idade;
		
		// Entrada de dados.
		System.out.println ("Digite sua idade");
		idade = leia.nextInt();
		
		// Processamento de dados e saída.
		if (idade < 18) {
			System.out.println ("Você não pode dirigir.");
		}
	}

}
