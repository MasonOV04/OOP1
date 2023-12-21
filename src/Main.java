import java.util.Scanner;

public class Main extends Account {





    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("На вашем банковском счету - " + account.getAmount() + "руб" );
        System.out.println("1-Пополнить счет ");
        System.out.println("2-Снять со счета (при снятие комиссия 1%)");
        System.out.println("3-Снятие со счета возможно 1 раз в месяц");
        System.out.println("3-Нет ничего делать не буду ");
        Scanner scanner = new Scanner(System.in);
        int num;
        int num2;
        switch (num=scanner.nextInt()) {
            case 1:
                System.out.println("g");
                do {
                    System.out.println("Сколько хотите пополнить? ");
                    account.put = scanner.nextFloat();
                    account.putAmount();
                    System.out.println("Хотите еще пополнить?");
                    System.out.println("1 - да");
                    System.out.println("2 - нет");
                    num2 = scanner.nextInt();

                } while (num2 == 1);
                System.out.println("Вашь баланс составляет " + account.getAmount());
                break;
            case 2:

                do {
                    System.out.println("Сколько хотите снять?");
                    CreditAccount creditAccount = new CreditAccount();
                    creditAccount.take = scanner.nextFloat();
                    creditAccount.takeAmount();
                    if (creditAccount.take > creditAccount.put){
                        System.out.println("У вас не достаточно денег для снятия");
                    }
                    System.out.println("Хотите еще снять?");
                    System.out.println("1 - да");
                    System.out.println("2 - нет");
                    num2 = scanner.nextInt();
                } while (num2 == 1);

                break;
            case 3:
                break;

        }




    }

}
