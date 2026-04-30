package pooHernaca;

public class Estudante extends Pessoa { //Classe Filha ou Classe Derivada de Pessoa
	

    private String matricula;
    private String curso;
    
	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		super(nome, idade, email);// super =>  Classe Mãe| Os itens devem ser declarados na ordem do construtor "filho"
		//Pessoa (nome, idade, email)
		this.matricula = matricula;
		this.curso = curso;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
