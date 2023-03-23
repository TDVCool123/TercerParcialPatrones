package examen.exercise1adapter;

public class AutoElectricoAdapter implements IAutomovil{
    private AutoElectrico autoElectrico = new AutoElectrico(100);

    public AutoElectricoAdapter(AutoElectrico autoElectrico) {
        this.autoElectrico = autoElectrico;
    }



    @Override
    public void cargar() {
        autoElectrico.cargar();
    }

    @Override
    public void estadoCombustible() {
        autoElectrico.estadoElectricidad();
    }
}
