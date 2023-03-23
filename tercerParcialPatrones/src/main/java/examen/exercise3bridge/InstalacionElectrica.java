package examen.exercise3bridge;

public class InstalacionElectrica implements IEmpresas {

    private String codigo;
    private double precio;

    public InstalacionElectrica(String codigo, Double precio) {
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
        System.out.println("Servicio de Insalacion Electrica");
        System.out.println("Codigo Medidor: "+codigo);
        System.out.println("Precio original: "+precio+" Bs.");

    }




}
