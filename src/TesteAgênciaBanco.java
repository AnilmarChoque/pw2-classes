
public class TesteAg�nciaBanco {

	public static void main(String[] args) {
		Ag�ncia a1 = new Ag�ncia();
		a1.n�mero = "46454";
		
		Banco b1 = new Banco();
		b1.n�mero = "35451";
		b1.saldo = "1500";
		b1.limite = "2000";
		b1.ag�ncia = a1;
		
		System.out.println(" "+ b1.n�mero + " " + b1.saldo + " " + b1.limite+ " " + b1.ag�ncia.n�mero);

	}

}
