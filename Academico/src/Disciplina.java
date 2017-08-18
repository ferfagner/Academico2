public class Disciplina {
	private String nome;
	private String curso;
	private int cargaHoraria;
	
	//Metodos
	
	public Disciplina(String nome, String professor, String curso, int cargaHoraria) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Disciplina nome " + nome + ", curso " + curso + ", cargaHoraria " + cargaHoraria +"Horas";
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String imprimirDisciplina(){
		return "\n Dados da Disciplina\n" +
				"Nome: " + getNome() + "\n" +
			   "Curso: " + getCurso() + "\n" +
				"Carga Horaria:" + getCargaHoraria();
	}
}