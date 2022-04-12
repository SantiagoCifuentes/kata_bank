import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Statement
{
    private List<Transaction> transactionList ;

    public Statement() {
        this.transactionList =  new ArrayList<>();
    }

    public void registerDeposit(double ammount, LocalDate date)
    {
        Transaction transaction = new Transaction();

        double balance = calculateBalance(ammount,TypeOfTransaction.deposit);

        transaction.depositTransaction(ammount,balance,date);

        transactionList.add(transaction);

    }
    public void registerWithdraw(double ammount, LocalDate date)
    {
        Transaction transaction = new Transaction();

        double balance = calculateBalance(ammount,TypeOfTransaction.withdraw);

        transaction.withdrawTransaction(ammount,balance,date);

        transactionList.add(transaction);

    }

    private  double calculateBalance(double amount, TypeOfTransaction typeOfTransaction){
        double balance = 0.0;


        for (int i = 0; i < transactionList.size(); i++) {
            balance += transactionList.get(i).typeOfTransactionAmount();
        }

        balance+= typeOfTransaction == TypeOfTransaction.deposit ? amount: -amount;

        return balance;
    }

    public String printer()
    {

        String statements = "              Date             Amount          Balance               Transaction\n";

        for (int i = 0; i <transactionList.size() ; i++)
        {

           statements += transactionList.get(i).toString() + "\n";

        }

        return  statements;
    }





}
