package atividadepoli;

public class Brinquedo {
    private String cor;
    private String nome;
    private String tipo;
    private int velocidade;

    public Brinquedo(String cor, String nome, String tipo, int velocidade) {
        this.cor = cor;
        this.nome = nome;
        this.tipo = tipo;
        this.velocidade = velocidade;
    }


    public void mover() {
        System.out.println(nome + " está se movendo.");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}

