 import java.time.LocalDate;
public class Principal {

	public static void main(String[] args) {
		
		Aluno a1= new Aluno("Fagner Fernandes Douetts", "21709716", "Masculino", LocalDate.of(1997, 4, 26));	
		Disciplina d1 = new Disciplina("LTP1", "Ciencias da Computa��o", "75hrs");
		Professor p1 = new Professor("Gis�", "21356415", "superior", "12514251365");
		Turma t1 = new Turma("Turma B", p1, d1);
		
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(p1);
		System.out.println(t1);
	}

}
