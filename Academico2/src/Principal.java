
import java.time.LocalDate;
public class Principal {

	public static void main(String[] args) {
		
		Aluno a1= new Aluno("Fagner Fernandes Douetts", "21709716", "Masculino", LocalDate.of(1997, 4, 26));	
		Disciplina d1 = new Disciplina("LTP1", "Ciencias da Computação", "75hrs");
		Professor p1 = new Professor("Gisé", "21356415", "superior", "12514251365");
		Turma t1 = new Turma("Turma B", p1, d1);
		Aluno a2 = new Aluno("Maria", "21523645", "F", LocalDate.of(1997, 4, 26));
		//adicionar a1 em t1
		
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2);
		
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(p1);
		System.out.println(t1);
		System.out.println(t1.getAlunos());
	}

}
