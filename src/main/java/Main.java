import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args) {
        Account account = new Account(new Statement());

        account.deposit(50.0,"12/04/2022");
        account.withdraw(10.0,"19/04/2022");
        account.printStatements(System.out);
    }

}
