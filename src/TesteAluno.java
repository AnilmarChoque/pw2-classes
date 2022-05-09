
public class TesteAluno {

	public static void main(String[] args) {
		
		Turma t1 = new Turma();
		t1.Período = "Manhã";
		t1.Série = "7º ano";
		t1.Sigla = "AI";
		t1.Tipo = "Ensino Fundamental";
		
		Turma t2 = new Turma();
		t2.Período = "Tarde";
		t2.Série = "1ºMédio";
		t2.Sigla = "AI";
		t2.Tipo = "Ensino Médio";
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Geremias";
		aluno1.RG = "33.156.666-7";
		aluno1.dataNasc = "09/09/2006";
		aluno1.turma = t1;
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Juliette";
		aluno2.RG = "66.345.361-4";
		aluno2.dataNasc = "13/10/2007";
		aluno2.turma = t2;
		

		System.out.println("" +aluno1.turma.Período + " " + aluno1.turma.Série + " " + aluno1.turma.Sigla + " " + aluno1.turma.Tipo);
		System.out.println("" +aluno1.nome + "\n" +aluno1.RG + "\n" +aluno1.dataNasc);
		
		System.out.println("\n");
		
		System.out.println("" +aluno2.turma.Período + " " + aluno2.turma.Série + " " + aluno2.turma.Sigla + " " + aluno2.turma.Tipo);
		System.out.println("" +aluno2.nome + "\n" +aluno2.RG + "\n" +aluno2.dataNasc);

	}

}
