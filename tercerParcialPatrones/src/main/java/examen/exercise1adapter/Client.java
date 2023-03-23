package examen.exercise1adapter;

public class Client {
    public static void main(String []args){

        IAutomovil automovilDiesel = new AutoDiesel(0);

        automovilDiesel.cargar();
        automovilDiesel.estadoCombustible();

        IAutomovil automovilGasolina = new AutoGasolina(0);

        automovilGasolina.cargar();
        automovilGasolina.estadoCombustible();

        AutoElectrico autoElectrico = new AutoElectrico(0);

        IAutomovil autoE = new AutoElectricoAdapter(autoElectrico);

        autoE.cargar();
        autoE.estadoCombustible();

    }
}
