 import java.util.Calendar;
public class Principal {

	public static void main(String[] args) {
		
		//retornar data como string
		Calendar datadeNascimento = Calendar.getInstance();
		datadeNascimento.set(Calendar.YEAR, 1997);
		datadeNascimento.set(Calendar.MONTH, Calendar.APRIL);
		datadeNascimento.set(Calendar.DAY_OF_MONTH, 26);
		
		Aluno a1= new Aluno("Fagner Fernandes Douetts", "21709716", "Masculino", datadeNascimento);	
		Disciplina d1 = new Disciplina("LTP1", "Ciencias da Computação", "75hrs");
		Professor p1 = new Professor("Gisé", "21356415", "superior", "12514251365");
		Turma t1 = new Turma("Turma B", p1, d1);
		
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(p1);
		System.out.println(t1);
	}

}
