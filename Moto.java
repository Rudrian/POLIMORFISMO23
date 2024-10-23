package atividadepoli;

public class Moto extends Brinquedo {
    public Moto() {
        super("Preta", "Moto de Corrida", "Terrestre", 150);
    }

    @Override
    public void mover() {
        System.out.println(getNome() +" "+ getCor() +" está se movendo rapidamente a " + getVelocidade() + " km/h.");
    }
}

