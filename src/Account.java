import java.util.Random;
import java.util.Scanner;

public class Account {
    private float balance = 10000;
    public float put;
    public float take;




    public void putAmount() { // пополнение

        balance = getAmount() + getPut();
        System.out.println(balance);


    }

    public void takeAmount() { // снятие

        balance = getAmount() - getTake();





    }
    public float getAmount() { // текущий баланс
        return balance;
    }




    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public float getPut() {
        return put;
    }

    public void setPut(float put) {
        this.put = put;
    }

    public float getTake() {
        return take;
    }

    public void setTake(float take) {
        this.take = take;
    }
}
