import java.util.ArrayList;

public class Turma {
	private String codigo;
	private Professor professor;
	private Disciplina disciplina;
	private ArrayList<Aluno> alunos;
	
	
	
	public Turma(String codigo, Professor professor, Disciplina disciplina) {
		super();
		this.codigo = codigo;
		this.professor = professor;
		this.disciplina = disciplina;
		this.alunos = new ArrayList<>();
	}
	@Override
	public String toString() {
		return "Turma codigo=" + codigo + professor +  disciplina ;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	//get e set alunos
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	//meto que adiciona um aluno na turma
	public void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
	}
	
}	
