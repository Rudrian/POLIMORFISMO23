package atividadepoli;

public class Cliente {
    private String nome;
    private ContaBancaria conta;

    public Cliente(String nome, ContaBancaria conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public void exibirInfo() {
        System.out.println("Cliente: " + nome);
        System.out.println("Conta Número: " + conta.getNumero());
        System.out.println("Saldo: R$ " + conta.getSaldo());
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}

   
}

