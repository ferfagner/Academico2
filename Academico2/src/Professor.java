
public class Professor {
	private String nome;
	private String matricula;
	private String titulacao;
	private String cpf;
	
	
    //metodos
	
	public Professor(String nome, String matricula, String titulacao, String cpf) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.titulacao = titulacao;
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Professor nome=" + nome + ", matricula=" + matricula + ", titulacao=" + titulacao + ", cpf=" + cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




}
