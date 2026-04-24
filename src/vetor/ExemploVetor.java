package vetor;

public class ExemploVetor {

	public static void main(String[] args) {
		String vetorCachorros[] = {"Boxer","Pastor Alemão", "Pinscher", "Husky", "Corgi"};
		
		for(byte contador = 0; contador <5; contador++) {
			System.out.println((contador+1)+"º elemento: " + vetorCachorros[contador]);
		}
		
		System.out.println("\n\n\n\n\n");
		
		System.out.println("1º elemento: " + vetorCachorros[0]);
        System.out.println("2º elemento: " + vetorCachorros[1]);
        System.out.println("3º elemento: " + vetorCachorros[2]);
        System.out.println("4º elemento: " + vetorCachorros[3]);
        System.out.println("5º elemento: " + vetorCachorros[4]);
	}

}
