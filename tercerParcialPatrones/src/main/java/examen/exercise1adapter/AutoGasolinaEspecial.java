package examen.exercise1adapter;

import java.util.Random;

public class AutoGasolinaEspecial implements IAutomovil {
    Random r = new Random();
    int low = 0;
    int high = 100;
    private int combustible;

    public AutoGasolinaEspecial(int combustible) {
        this.combustible = combustible;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    @Override
    public void cargar() {

        int gasolinaEspecial = r.nextInt(high-low) + low;
        System.out.println("Carga de gasolinaEspecial: " + gasolinaEspecial);

    }

    @Override
    public void estadoCombustible() {

        int estado = r.nextInt(high-low) + low;
        System.out.println("Estado de gasolinaEspecial: "+ estado);
    }

}
