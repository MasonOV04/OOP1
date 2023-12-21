import java.util.Scanner;

public class CreditAccount extends Account {

    @Override
    public void takeAmount() {
       float a = getAmount()- getTake();
       float pr = a/100;
       float b = a - pr;
        System.out.println(b);

    }
}

