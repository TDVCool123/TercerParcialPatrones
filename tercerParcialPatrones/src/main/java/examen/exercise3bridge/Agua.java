package examen.exercise3bridge;

public class Agua implements IEnvioPaquete {

    private IEmpresas empresas;

    public Agua(IEmpresas empresas) {
        this.empresas = empresas;
    }



    public IEmpresas getEmpresas() {
        return empresas;
    }



    public void setEmpresas(IEmpresas empresas) {
        this.empresas = empresas;
    }



    @Override
    public void envio() {
        empresas.info();
        int price = empresas.getPrecio();
        price = price + (price*25/100);

        System.out.println("Mandando paquete por Agua");
        System.out.println("El precio extra de envio por agua es del: "+25+"%");
        System.out.println("Precio final: "+ price+" Bs.\n");


    }
}
