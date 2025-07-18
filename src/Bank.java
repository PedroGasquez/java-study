import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Bank {
     public String accountNumber;
     public String agencyNumber;
     public String name;
     public LocalDate birthDate;
     public double Money;
     private List<BankMoviments> history;

    public Bank(String accountNumber, String agencyNumber, String name, LocalDate birthDate, double inicialMoney) {
        this.accountNumber = accountNumber;
        this.agencyNumber = agencyNumber;
        this.name = name;
        this.birthDate = birthDate;
        this.Money = inicialMoney;

        this.history = new ArrayList<>();

        this.history.add(new BankMoviments("New Account", inicialMoney, "Incial Money"));
    }

    public void Deposit(double depositAmount) {
        this.Money += depositAmount;
        System.out.println("Deposited " + depositAmount);
        this.history.add(new BankMoviments("Deposit", depositAmount, "Deposit"));
        System.out.println("You have deposited " + this.Money);
    }

     public void Withdraw(double money){
         if(money <= 0){
             System.out.println("Insufficient funds!");
         }
         else if(money > money){
             System.out.println("Insufficient funds!");
         }
          this.Money -= money;
         System.out.println("Withdraw Successfully!");
         this.history.add(new BankMoviments("Withdraw", money,"Withdraw on terminal"));
         System.out.println("You have withdrawn " + money);
     }

    public void TransferMoney(double value, Bank accountBank){
        if(value <= 0)
            System.out.println("Insufficient funds!");

        if(value > this.Money){
            System.out.println("Insufficient funds!");
            return;
        }

            this.Money -= value;
            this.history.add(new BankMoviments("Transfer", value, "Transfer" + accountBank.name));

            accountBank.Deposit(value);

    }

    public void impressExtract(){
        System.out.println("\n=======================================================================");
        System.out.println("Bank Account Number: " + this.accountNumber);
        System.out.println("Bank Agency Number: " + this.agencyNumber);
        System.out.println("Bank Name: " + this.name);
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-10s | %-25s | %-12s | %s\n", "DATA", "TYPE", "VALUE", "DESCRIPTION");
        System.out.println("-----------------------------------------------------------------------");

        if(this.history.isEmpty()){
            System.out.println("No history!");
        }else {
            for (BankMoviments mov : this.history){
                System.out.println(mov);
            }
        }
    }

}
