
public class TesteClienCart�es {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.nome = "Augustinho";
		c1.c�digo = "113";
		c1.status = statuscliente.ATIVO;
		
		Cart�es credito = new Cart�es();
		credito.n�mero = "123456";
		credito.DataValid = "19/10/2030";
		credito.tipo = Cart�o.CR�DITO;
		credito.cliente = c1;
		
		System.out.println(" "+ c1.nome + " " + c1.c�digo + " " + c1.status);
		System.out.println(" "+ credito.n�mero + " " + credito.DataValid + " " + credito.tipo + " " + credito.cliente.nome);

	}

}
