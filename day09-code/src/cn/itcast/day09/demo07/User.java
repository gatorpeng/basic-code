package cn.itcast.day09.demo07;

public class User {
    private String name;
    private int balance;

    public User() {
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("Name: " +name+
                "; Balance: " +balance);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
