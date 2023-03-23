package examen.exercise3bridge;

public class TransferenciaBancaria implements IEnvioPaquete {

        private IEmpresas service;
        private double descPercentage=0.05;

	public TransferenciaBancaria(IEmpresas service) {
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
            double price = service.getPrecio();
            price = price - (price*descPercentage);
            service.setPrecio(price);
            System.out.println("> Se realizo el pago con Transferencia Bancaria!");
            System.out.println("> Se aplico un descuento del "+descPercentage*100.00+"%");
            System.out.println("> Precio final: "+service.getPrecio()+" Bs.\n");


        }
}
