package examen.exercise2proxy;

public class Account {
    private String user;
    private String password;
    private int ci;

    public Account(String user, String password,int ci) {
        this.user = user;
        this.password = password;
        this.ci = ci;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public void info() {
        System.out.println(">    User: " +user+ "#" + ci + " (Password: "+password+")");
    }

}
