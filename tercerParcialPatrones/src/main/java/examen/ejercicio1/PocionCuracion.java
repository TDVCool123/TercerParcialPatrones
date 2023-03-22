package examen.ejercicio1;

    public class PocionCuracion extends Decorator{
        public PocionCuracion(IPersonaje personaje) {
            super(personaje);
        }

        @Override
        public void curar(int puntos){
            super.curar(puntos+80);
        }
}
