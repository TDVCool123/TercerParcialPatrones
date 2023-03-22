package examen.ejercicio2;

public class Efectivo implements IPayMethod {

    private IService service;

    public Efectivo(IService service) {
        this.service = service;
    }



    public IService getService() {
        return service;
    }



    public void setService(IService service) {
        this.service = service;
    }



    @Override
    public void discount() {
        service.info();
        System.out.println("> Se realizo el pago con efectivo");
        System.out.println("> Precio final: "+service.getPrecio()+" Bs.\n");

    }
}
