package introducao;

public class VariaveisConstantes {

	public static void main(String[] args) {
		// Variaveis
		int idade = 25;
		String nome = "Lilian";
		float graus = 20.0f;	//float -> ponto flutuantes
		boolean resposta;		//boolean -> lógico true/false
		
		//Constantes - Por práticas colocamos em maiúscula
		final int QUANTIDADE = 50;
		final String TURMA = "Turma 84";
		final double PI = 3.1415;
		
		// Saída do print
		System.out.print(nome);	//print -> não pula linha, usamos, para isso, "\n"
		System.out.println(QUANTIDADE);  //println pula a linha
		System.out.println(PI);
	}

}
