package examen.exercise3bridge;

public class Client {
    public static void main(String[] args) {
        InstalacionElectrica electr = new InstalacionElectrica("46546556", 200.00);
        InstalacionAgua agua = new InstalacionAgua("57451", 30.00);
        InstalacionAlcantarillado alcant = new InstalacionAlcantarillado("5474893", 50.00);

        Efectivo efec = new Efectivo(electr);
        efec.envio();
        efec.setService(agua);
        efec.envio();
        efec.setService(alcant);
        efec.envio();

        App app = new App(electr);
        app.envio();

        TigoMoney tigo = new TigoMoney(alcant);
        tigo.envio();

        TransferenciaBancaria banco = new TransferenciaBancaria(agua);
        banco.envio();


    }

}
