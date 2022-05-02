
public class TesteAgênciaBanco {

	public static void main(String[] args) {
		Agência a1 = new Agência();
		a1.número = "46454";
		
		Banco b1 = new Banco();
		b1.número = "35451";
		b1.saldo = "1500";
		b1.limite = "2000";
		b1.agência = a1;
		
		System.out.println(" "+ b1.número + " " + b1.saldo + " " + b1.limite+ " " + b1.agência.número);

	}

}
