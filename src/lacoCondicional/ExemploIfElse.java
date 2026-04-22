package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		float n1, n2, media;
		
		// Entrada de dados.
		System.out.println ("Digite suas notas");
		n1 = leia.nextFloat();
		n2 = leia.nextFloat();
		
		// Processamento de dados.
		media = (n1+n2)/2.0f;
		
		// Validação condicional e saída.
		if (media < 5) {
			System.out.println ("Alune REPROVADE.");
		}else {
			System.out.println ("Alune APROVADE.");	
		}
	}

}
