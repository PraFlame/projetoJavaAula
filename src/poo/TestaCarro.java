package poo;

public class TestaCarro {

	public static void main(String[] args) {
		
		// Instanciamento | Instanciar objeto.
		Carro c1 = new Carro("kombi", 4, 4, "Xpto");
		Carro c2 =  new Carro("Toyota", 2, 6, "Supra");
		
		//c1.marca = "Kombi";
		c1.setMarca("Kombi");
		//c1.portas = 4;
		c1.setPortas(4);
		
		c1.locomocao();
		/*
		comentário
		em mais de 
		uma linha
		*/
		System.out.println("Marcar: "+c1.getMarca());
		System.out.println("Quantidade de portas: "+c1.getPortas());
		
		System.out.println(c1.parar());
		
		System.out.println("Marcar: "+c2.getMarca());
		System.out.println("Quantidade de portas: "+c2.getPortas());
		
	}

}
