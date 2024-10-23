package atividadepoli;

public class Computador {
	private String modelo;
	private Processador processador;

	public Computador(String modelo, Processador processador) {
		this.modelo = modelo;
		this.processador = processador;
	}

	public void exibirInfo() {
		System.out.println("Modelo do Computador: " + modelo);
		processador.exibirInfo();
	}
}
