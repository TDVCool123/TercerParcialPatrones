package practica.ejercicio2;

public class Client {
    public static void main(String[] args) {
        InstalacionElectrica electr = new InstalacionElectrica("46546556", 200.00);
        InstalacionAgua agua = new InstalacionAgua("57451", 30.00);
        InstalacionAlcantarillado alcant = new InstalacionAlcantarillado("5474893", 50.00);

        Efectivo efec = new Efectivo(electr);
        efec.discount();
        efec.setService(agua);
        efec.discount();
        efec.setService(alcant);
        efec.discount();

        App app = new App(electr);
        app.discount();

        TigoMoney tigo = new TigoMoney(alcant);
        tigo.discount();

        TransferenciaBancaria banco = new TransferenciaBancaria(agua);
        banco.discount();


    }

}
