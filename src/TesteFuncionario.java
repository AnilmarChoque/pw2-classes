
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Endere�o end1 = new Endere�o();
		end1.logradouro = "Rua Alc�ntara";
		end1.n�mero = "113";
		end1.bairro = "Vila Guilherme";
		end1.cidade = "S�o Paulo";
		end1.estado = "S�o Paulo";
		
		Endere�o end2 = new Endere�o();
		end2.logradouro = "Estrada da Cachoeira";
		end2.n�mero = "801";
		end2.bairro = "Jardim S�o Jo�o";
		end2.cidade = "S�o Paulo";
		end2.estado = "S�o Paulo";
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.Cargo = "Diretor";
		funcionario1.SalFunc = "R$2500";
		funcionario1.endere�o = end1;
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.Cargo = "Zelador";
		funcionario2.SalFunc = "R$1200";
		funcionario2.endere�o = end2;
		
		System.out.println("" + funcionario1.endere�o.logradouro+" " +funcionario1.endere�o.n�mero +" " +funcionario1.endere�o.bairro +" " +funcionario1.endere�o.cidade +" " +funcionario1.endere�o.estado +"");
		System.out.println("" +funcionario1.Cargo +" " +funcionario1.SalFunc + "\n");
		
		System.out.println("" + funcionario2.endere�o.logradouro+" " +funcionario2.endere�o.n�mero +" " +funcionario2.endere�o.bairro +" " +funcionario2.endere�o.cidade +" " +funcionario2.endere�o.estado +"");
		System.out.println("" +funcionario2.Cargo +" " +funcionario2.SalFunc);
		
	}

}
