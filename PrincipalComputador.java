package atividadepoli;

public class PrincipalComputador {
	public static void main(String[] args) {

		Processador processador = new Processador("Ryzen", "4.6 GHz");

		Computador computador = new Computador("Dell Inspiron 12A", processador);

		computador.exibirInfo();
	}
}