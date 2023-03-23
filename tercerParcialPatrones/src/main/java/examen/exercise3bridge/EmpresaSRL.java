package examen.exercise3bridge;

public class EmpresaSRL implements IEmpresas {

    private String name;
    private int precio;
    private int peso;



    public EmpresaSRL(String name, int precio,int peso) {
        this.name = name;
        this.precio = precio;
        this.peso = peso;
    }

    public String getCodigo() {
        return name;
    }



    public void setCodigo(String codigo) {
        this.name = codigo;
    }


    @Override
    public int getPrecio() {
        return precio;
    }


    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public void info() {
        System.out.println("Pedido a la empresa SRL");
        System.out.println("Nombre del Producto: "+name);
        System.out.println("Precio original: "+precio+" Bs.");
        System.out.println("peso Total: "+peso+" Kg.");

    }


}
