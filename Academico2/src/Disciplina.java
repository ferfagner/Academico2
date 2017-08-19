
public class Disciplina {
	private String nome;
	private String curso;
	private String CargaHoraria;
	
	
//metodos	
	
	public Disciplina(String nome, String curso, String cargaHoraria) {
		super();
		this.nome = nome;
		this.curso = curso;
		CargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", curso=" + curso + ", CargaHoraria=" + CargaHoraria + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCargaHoraria() {
		return CargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}


}
