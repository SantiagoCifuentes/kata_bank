import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Account
{

    Statement statement;


    public Account(Statement statement) {
        this.statement= statement;
    }

    public Account(){
        statement= new Statement();
    }


    void deposit(Double amount,String date)
    {
       LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

       statement.registerDeposit(amount,date1);

    }

    void withdraw(Double amount,String date){
        LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        statement.registerWithdraw(amount,date1);
    }



}
