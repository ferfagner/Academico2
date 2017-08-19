 import java.time.LocalDate;
public class Aluno {
	private String nome;
	private String RA;
	private String sexo;
	private LocalDate datadeNascimento;
	
	//metodos	
	public Aluno(String nome, String rA, String sexo, LocalDate datadeNascimento) {
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
	public LocalDate getDatadeNascimento() {
		return datadeNascimento;
	}
	public void setDatadeNascimento(LocalDate datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}
	
	//metodo para reculperar a data como stringo
	public String datadeNascComoString(){
		return datadeNascimento.getDayOfMonth() + "/" + 
				datadeNascimento.getMonthValue() + "/" +
				datadeNascimento.getYear();
		
	}


}
