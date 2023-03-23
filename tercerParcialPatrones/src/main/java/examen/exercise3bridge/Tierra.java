package examen.exercise3bridge;

public class Tierra implements IEnvioPaquete {

    private IEmpresas empresas;

    public Tierra(IEmpresas empresas) {
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
        price = price + (price*5/100);
        System.out.println("Mandando paquete por tierra");
        System.out.println("El precio extra de envio por tierra es del: "+5+"%");
        System.out.println("Precio final: "+ price+" Bs.\n");


    }

}
