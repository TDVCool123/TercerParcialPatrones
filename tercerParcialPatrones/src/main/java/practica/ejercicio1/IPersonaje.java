package practica.ejercicio1;

public interface IPersonaje {
    void atacar(IPersonaje victima);
    void recibirAtaque(IPersonaje atacante, int damage);
    void curar(int puntos);
}
