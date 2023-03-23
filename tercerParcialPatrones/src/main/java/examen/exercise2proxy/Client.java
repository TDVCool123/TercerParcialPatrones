package examen.exercise2proxy;

public class Client {
    public static void main(String[] args) {
        Proxy p = new Proxy();

        Account u1 = new Account("Mauri", "123",17);
        Account u2 = new Account("Jorge", "asdf",16);
        Account u3 = new Account("Teren", "admin",13);
        Account u4 = new Account("Jonathan", "abcd",3);

        p.login(u1, "123");
        p.login(u2, "asdf");
        p.login(u4, "abcd");
        p.login(u3, "admin");

        p.info();

    }
}
