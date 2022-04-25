
public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Geremias";
		aluno1.RG = "33.156.666-7";
		aluno1.dataNasc = "09/09/2006";
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Juliette";
		aluno2.RG = "66.345.361-4";
		aluno2.dataNasc = "13/10/2007";
		
		System.out.println("" +aluno1.nome +" " +aluno1.RG +" " +aluno1.dataNasc);
		
		System.out.println(""+aluno2.nome +" " +aluno2.RG +" " +aluno2.dataNasc);

	}

}
