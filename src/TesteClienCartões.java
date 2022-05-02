
public class TesteClienCartões {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.nome = "Augustinho";
		c1.código = "113";
		c1.status = statuscliente.ATIVO;
		
		Cartões credito = new Cartões();
		credito.número = "123456";
		credito.DataValid = "19/10/2030";
		credito.tipo = Cartão.CRÉDITO;
		credito.cliente = c1;
		
		System.out.println(" "+ c1.nome + " " + c1.código + " " + c1.status);
		System.out.println(" "+ credito.número + " " + credito.DataValid + " " + credito.tipo + " " + credito.cliente.nome);

	}

}
