package atividadepoli;


public class Navio extends Brinquedo {

    public Navio() {
        super("Branco", "Navio Cruzeiro", "Aquático", 40);
    }

    @Override
    public void mover() {
        System.out.println(getNome() +" "+ getCor() + " está navegando no mar a " + getVelocidade() + " km/h.");
    }
}