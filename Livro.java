package atividadepoli;

public class Livro {
	private String autor;
    private String titulo;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }
}
