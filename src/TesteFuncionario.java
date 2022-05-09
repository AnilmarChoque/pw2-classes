
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Endereço end1 = new Endereço();
		end1.logradouro = "Rua Alcântara";
		end1.número = "113";
		end1.bairro = "Vila Guilherme";
		end1.cidade = "São Paulo";
		end1.estado = "São Paulo";
		
		Endereço end2 = new Endereço();
		end2.logradouro = "Estrada da Cachoeira";
		end2.número = "801";
		end2.bairro = "Jardim São João";
		end2.cidade = "São Paulo";
		end2.estado = "São Paulo";
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.Cargo = "Diretor";
		funcionario1.SalFunc = "R$2500";
		funcionario1.endereço = end1;
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.Cargo = "Zelador";
		funcionario2.SalFunc = "R$1200";
		funcionario2.endereço = end2;
		
		System.out.println("" + funcionario1.endereço.logradouro+" " +funcionario1.endereço.número +" " +funcionario1.endereço.bairro +" " +funcionario1.endereço.cidade +" " +funcionario1.endereço.estado +"");
		System.out.println("" +funcionario1.Cargo +" " +funcionario1.SalFunc + "\n");
		
		System.out.println("" + funcionario2.endereço.logradouro+" " +funcionario2.endereço.número +" " +funcionario2.endereço.bairro +" " +funcionario2.endereço.cidade +" " +funcionario2.endereço.estado +"");
		System.out.println("" +funcionario2.Cargo +" " +funcionario2.SalFunc);
		
	}

}
