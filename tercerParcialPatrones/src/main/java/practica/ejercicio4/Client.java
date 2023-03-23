package practica.ejercicio4;

public class Client {
    public static void main(String[] args) {
        Proxy p = new Proxy();

        Account u1 = new Account("Mauri", "123");
        Account u2 = new Account("Jorge", "asdf");
        Account u3 = new Account("Teren", "admin");
        Account u4 = new Account("Jonathan", "abcd");

        p.login(u1, "123");
        p.login(u2, "asdf");
        p.login(u4, "asdfasg");
        p.login(u3, "admin");

        p.info();

    }
}
