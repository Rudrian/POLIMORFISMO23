package atividadepoli;

public class PrincipalConta {

	    public static void main(String[] args) {
	        ContaBancaria conta = new ContaBancaria("12345-6", 1000.0);
	        Cliente cliente = new Cliente("João", conta);

	        cliente.exibirInfo();
	}

}
