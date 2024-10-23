package atividadepoli;

public class PrincipalBiblio {

	public static void main(String[] args) {

			String autor = "Stephen King";
			String titulo = "O Iluminado";

			Livro livro = new Livro(autor, titulo);

			Biblioteca biblioteca = new Biblioteca("SESI");

			biblioteca.exibirInfo();
			livro.exibirInfo();
		}
	}
	}

}
