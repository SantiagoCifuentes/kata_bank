import java.time.LocalDate;

public class Transaction
{
    private LocalDate date;
    private double ammount;
    private double balance;
    private TypeOfTransaction typeOfTransaction;


    public Transaction() {
    }

    public  void depositTransaction(double ammount,double balance,LocalDate date)
    {
        this.ammount=ammount;
        this.balance=balance;
        this.date=date;
        this.typeOfTransaction = TypeOfTransaction.deposit;
    }

    public  void withdrawTransaction(double ammount,double balance,LocalDate date)
    {
        this.ammount=ammount;
        this.balance=balance;
        this.date=date;
        this.typeOfTransaction = TypeOfTransaction.withdraw;
    }

    public double typeOfTransactionAmount(){
      return  typeOfTransaction == TypeOfTransaction.deposit ? ammount: -ammount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", ammount=" + ammount +
                ", balance=" + balance +
                ", typeOfTransaction=" + typeOfTransaction +
                '}';
    }
}
