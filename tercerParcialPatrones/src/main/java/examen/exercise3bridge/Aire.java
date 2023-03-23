package examen.exercise3bridge;

public class Aire implements IEnvioPaquete {

    private IEmpresas empresas;


    public Aire(IEmpresas empresas) {
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
        price = price + (price*10/100);
        System.out.println("Mandando paquete por aire");
        System.out.println("El precio extra de envio por aire es del: "+10+"%");
        System.out.println("Precio final: "+ price+" Bs.\n");


    }

}
