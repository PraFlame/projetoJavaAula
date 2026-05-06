package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {
		
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		//Stream
		List<String> estadosEmMaiusculo = estados.stream()
				.map(x -> x.toUpperCase()) // Operação Intermediária (Processamento)
				.collect(Collectors.toList());//Operação de Terminal (Finalização)
		
		List<String> estadosUnicos = estados.stream()
				.distinct()// É Case Sensitive
				.collect(Collectors.toList());
		
		long quantidadeEstados = estados.stream()
				.distinct()
				.count(); //Operação terminal
		
		System.out.println("Estados em maiúsculo: " + estadosEmMaiusculo);
		System.out.println("Estados em Únicos: " + estadosUnicos);
		System.out.println("Quantidade de stados em Únicos: " + quantidadeEstados);
		System.out.println("\nColeção/Dados inicial: " + estados);
	}

}
