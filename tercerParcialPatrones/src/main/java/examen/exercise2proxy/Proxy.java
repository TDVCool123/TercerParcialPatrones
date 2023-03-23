package examen.exercise2proxy;

public class Proxy implements IServer {
    private IServer server1 = new Server("Skynet");
    private IServer server2 = new Server("SuperPC");
    private int logged=0;

    public Proxy() {}

    public IServer getServer1() {
        return server1;
    }

    public void setServer1(IServer server1) {
        this.server1 = server1;
    }

    public IServer getServer2() {
        return server2;
    }

    public void setServer2(IServer server2) {
        this.server2 = server2;
    }

    public int getLogged() {
        return logged;
    }

    public void setLogged(int logged) {
        this.logged = logged;
    }

    public  boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }

    @Override
    public void login(Account user, String pwd) {
        if (user.getPassword().equals(pwd)) {
            if(esPrimo(user.getCi())) {
                server1.login(user, pwd);
            }else {
                server2.login(user, pwd);
            }
            logged++;
        }else {
            System.out.println("Contrasena incorrecta, intente nuevamente");
        }

    }

    @Override
    public void info() {
        server1.info();
        server2.info();

    }


}
