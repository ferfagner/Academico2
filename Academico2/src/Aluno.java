 import java.util.Calendar;
public class Aluno {
	private String nome;
	private String RA;
	private String sexo;
	private Calendar datadeNascimento;
	
	//metodos	
	public Aluno(String nome, String rA, String sexo, Calendar datadeNascimento) {
		super();
		this.nome = nome;
		RA = rA;
		this.sexo = sexo;
		this.datadeNascimento = datadeNascimento;
	}
	
	public String toString() {
		return "Aluno [nome=" + nome + ", RA=" + RA + ", sexo=" + sexo + ", datadeNascimento=" + datadeNascimento + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Calendar getDatadeNascimento() {
		return datadeNascimento;
	}
	public void setDatadeNascimento(Calendar datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}



}
