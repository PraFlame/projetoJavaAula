package metodos;

import java.util.Scanner;

import metodoExterno.ExemploMetodoExterno;


public class ExemploMetodos {

	public static void main(String[] args) {
		
		int soma = somar(2,5);
		Scanner leia = new Scanner(System.in);
		String nome;
		
		System.out.println(soma);
		System.out.print(somar(54,13));
		mensagem();
		
		System.out.println("Bom dia, como se chama?");
		nome = leia.nextLine();
		
		saudacao(nome);
		
		ExemploMetodoExterno.info();

	}
	public static int somar(int numero1, int numero2) { //assinatura do método
		return numero1 + numero2;
	}
	public static void mensagem() {
		System.out.println("\nEsse método não tem retorno (void)");
		
	}
	public static void saudacao(String nome) {
		System.out.println("\nBom dia " + nome + "\n");
		
	}

}
