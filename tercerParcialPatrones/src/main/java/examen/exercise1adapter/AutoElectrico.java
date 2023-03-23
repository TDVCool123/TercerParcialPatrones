package examen.exercise1adapter;

import java.util.Random;

public class AutoElectrico implements IElectrico{
    Random r = new Random();
    int low = 0;
    int high = 100;
    private int bateria;

    public AutoElectrico(int bateria) {
        this.bateria = bateria;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public void cargar() {

        int Electricidad = r.nextInt(high-low) + low;
        System.out.println("Carga de Electricidad: " + Electricidad);

    }

    @Override
    public void estadoElectricidad() {

        int estado = r.nextInt(high-low) + low;
        System.out.println("Estado de Electricidad: "+ estado);
    }

}
