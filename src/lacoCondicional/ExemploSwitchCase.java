package lacoCondicional;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		// Declarações de variáveis.
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		// Entrada de dados.
		System.out.println ("Bem-vinde a Central Pain in Your Ass.\nQuer ouvir uma musiquinha irritante digite 1.\nCaso queira ser levado para um atendente de uma área diferente da sua dúvida, digite 2.\nDeseja falar com atendente pertinente, digite 0.");
		opcao = leia.nextInt();
		
		// Validação condicional e saída.
		switch (opcao) {
		case 1:
			System.out.println("Estamos redirecionando para nossa música mais irretante e mal equalizada.");
			break;
		case 2:
			System.out.println("Estamos redirecionando para nosso pior atendente.");
			break;
		default:
			System.out.println("Opção inválida. Péssimo dia. :)");
		}
	}

}
