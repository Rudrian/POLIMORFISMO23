package atividadepoli;


	public class Carro extends Brinquedo {
	    public Carro() {
	        super("Vermelho", "Carro Esportivo", "Terrestre", 120);
	    }

	    @Override
	    public void mover() {
	        System.out.println(getNome() +" "+ getCor() + " está correndo nas estradas a " + getVelocidade() + " km/h.");
	    }
	}