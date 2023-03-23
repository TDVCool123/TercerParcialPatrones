package examen.exercise3bridge;

public class Client {
    public static void main(String[] args) {
        EmpresaSA sa = new EmpresaSA("PaqueteSA", 200,15);
        EmpresaSRL srl = new EmpresaSRL("PaqueteSRl", 100,30);


        Agua agua = new Agua(sa);
        agua.envio();


        Tierra tierra = new Tierra(srl);
        tierra.envio();

        Aire aire = new Aire(sa);
        aire.envio();

        Agua agua1 = new Agua(srl);
        agua1.envio();

    }

}
