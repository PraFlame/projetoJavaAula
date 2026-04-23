package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		String nome1;
		int i;
        Scanner leia = new Scanner(System.in);
        for (i = 1; i <= 3; i++) {
        	System.out.println("\nDigite o "+i+"° nome: ");
        	nome1 = leia.nextLine();
        	System.out.println("O nome "+i+"° é: " + nome1);
        }

	}

}
