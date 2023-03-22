package examen.ejercicio2;

public class InstalacionAlcantarillado implements IService {

    private String codigo;
    private double precio;

    public InstalacionAlcantarillado(String codigo, Double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }




    public String getCodigo() {
        return codigo;
    }




    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }




    @Override
    public Double getPrecio() {
        return precio;
    }


    @Override
    public void setPrecio(Double precio) {
        this.precio = precio;
    }




    @Override
    public void info() {
        System.out.println("Servicio de Insalacion de Alcantarillado");
        System.out.println("Codigo Contrato: "+codigo);
        System.out.println("Precio original: "+precio+" Bs.");

    }


}
