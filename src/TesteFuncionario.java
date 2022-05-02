
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.Cargo = "Diretor";
		funcionario1.SalFunc = "R$2500";
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.Cargo = "Zelador";
		funcionario2.SalFunc = "R$1200";

		System.out.println("" +funcionario1.Cargo +" " +funcionario1.SalFunc);
		
		System.out.println("" +funcionario2.Cargo +" " +funcionario2.SalFunc);
		
	}

}
