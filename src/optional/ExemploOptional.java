package optional;

import java.util.Optional;

public class ExemploOptional {

	public static void main(String[] args) {
		
		String[] palavras = new String[10];
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		palavras[5] = "THURMA";
		
		if (checaNulo.isPresent()) {//Optional , tem um objeto dentro de você? True-tem objeto/False- não tem, objeto null.
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		}
		else {
			System.out.println("A palavra é nula!");
		}
	}

}
