package examen.exercise3bridge;

public class Efectivo implements IEnvioPaquete {

    private IEmpresas service;

    public Efectivo(IEmpresas service) {
        this.service = service;
    }



    public IEmpresas getService() {
        return service;
    }



    public void setService(IEmpresas service) {
        this.service = service;
    }



    @Override
    public void envio() {
        service.info();
        System.out.println("> Se realizo el pago con efectivo");
        System.out.println("> Precio final: "+service.getPrecio()+" Bs.\n");

    }
}
