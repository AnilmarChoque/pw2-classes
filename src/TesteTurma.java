
public class TesteTurma {
	public static void main(String[] args) {
		
		Turma Turma1 = new Turma();
		Turma1.Período = "Manhã";
		Turma1.Série = "7ºAno";
		Turma1.Sigla = "Al";
		Turma1.Tipo = "Ensino Fundamental";
		
		Turma Turma2 = new Turma();
		Turma2.Período = "Tarde";
		Turma2.Série = "1ºMédio";
		Turma2.Sigla = "AI";
		Turma2.Tipo = "Ensino Médio";
		
		System.out.println("" +Turma1.Período +" " +Turma1.Série +" " +Turma1.Sigla+ " " +Turma1.Tipo);
		System.out.println("" +Turma2.Período +" " +Turma2.Série +" " +Turma2.Sigla+ " " +Turma2.Tipo);
		
	}

}
