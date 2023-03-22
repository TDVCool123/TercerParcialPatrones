package examen.ejercicio1;

public class Client {
    public static void main(String[] args) {
        IPersonaje bob = new Personaje("Bob");
        IPersonaje patricio = new Personaje("Patricio");

        bob.atacar(patricio);

        bob = new Arma(bob, "Hacha");
        bob.atacar(patricio);

        patricio.curar(10);
        patricio = new PocionCuracion(patricio);

        patricio.curar(10);

        patricio.atacar(bob);

        patricio = new Arma(patricio, "Espada");
        patricio = new Arma(patricio, "Escopeta");
        patricio.atacar(bob);

    }
}
