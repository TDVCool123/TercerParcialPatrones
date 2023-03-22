package examen.ejercicio1;

    public class Escudo extends Decorator{
        public Escudo(IPersonaje personaje) {
            super(personaje);
        }

        @Override
        public void recibirAtaque(IPersonaje atacante, int damage) {
            super.recibirAtaque(atacante,damage-10);
        }
}
