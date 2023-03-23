package practica.ejercicio1;

    public class Personaje implements IPersonaje{
        private String nombre;
        private int nivel = 100;
        private int puntosAtaque = 10;
        private int puntosDefensa = 1;
        private int puntosRegeneracion = 1;

        public Personaje(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getNivel() {
            return nivel;
        }

        public void setNivel(int nivel) {
            this.nivel = nivel;
        }

        public int getPuntosAtaque() {
            return puntosAtaque;
        }

        public void setPuntosAtaque(int puntosAtaque) {
            this.puntosAtaque = puntosAtaque;
        }

        public int getPuntosDefensa() {
            return puntosDefensa;
        }

        public void setPuntosDefensa(int puntosDefensa) {
            this.puntosDefensa = puntosDefensa;
        }

        public int getPuntosRegeneracion() {
            return puntosRegeneracion;
        }

        public void setPuntosRegeneracion(int puntosRegeneracion) {
            this.puntosRegeneracion = puntosRegeneracion;
        }

        @Override
        public void atacar(IPersonaje victima) {
            victima.recibirAtaque(this, puntosAtaque);
        }

        @Override
        public void recibirAtaque(IPersonaje atacante, int damage) {
            nivel-=(damage-puntosDefensa);

            System.out.println("Personaje: "+nombre);
            System.out.println("> Danio recibido: "+(damage-puntosDefensa));
            System.out.println("> Vida restante: "+nivel);
        }

        @Override
        public void curar(int puntos) {
            nivel+=puntos;
            System.out.println("Personaje: "+nombre);
            System.out.println("> Vida restante: "+nivel);
        }
}
