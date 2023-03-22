package examen.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Server implements IServer {
    private String name;
    private List<Account>accountList = new ArrayList<>();
    public Server(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Account> getAccountList() {
        return accountList;
    }
    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public void login(Account user, String pwd) {
        System.out.println("Inicio de sesion exitoso");
        accountList.add(user);

    }
    @Override
    public void info() {
        System.out.println("SERVER: "+name);
        System.out.println("Users logging in: ");
        for (Account user: accountList) {
            user.info();
        }

    }




}
