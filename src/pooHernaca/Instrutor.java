package pooHernaca;

public class Instrutor extends Pessoa{

	
	private String especialidade;

	public Instrutor(String nome, int idade, String email, String especialidade) {
		super(nome, idade, email);//Alteração da classe mãe pela Flame.
		
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}