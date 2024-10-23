package atividadepoli;

public class PrincipalBrin {

    public static void main(String[] args) {

        Brinquedo moto = new Moto();
        Brinquedo carro = new Carro();
        Brinquedo navio = new Navio();

        moto.mover();
        carro.mover();
        navio.mover();
    }
}
