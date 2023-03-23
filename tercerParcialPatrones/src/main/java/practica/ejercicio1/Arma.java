package practica.ejercicio1;

public class Arma extends Decorator{
    private String tipo;
    public Arma(IPersonaje personaje, String tipo) {
        super(personaje);
        this.tipo = tipo;
    }

    @Override
    public void atacar(IPersonaje victima) {
        super.atacar(victima);
        victima.recibirAtaque(this, 30);
    }
}
