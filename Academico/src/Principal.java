
public class Principal {

	public static void main(String[] args) {
		
		Aluno a1= new Aluno("Fagner Fernandes Douetts", "21709716", 20, "Ciencias da Computacao", "Noturno", "Masculino");
		System.out.println(a1.imprimirAluno());
		
		Disciplina d1 = new Disciplina("LTP1", "Gisonaldo", "Ciencias da computacao", 75);
				System.out.println(d1.imprimirDisciplina());		
				
				System.out.println(a1.getCurso());
				System.out.println(a1.getIdade());
	}

}
