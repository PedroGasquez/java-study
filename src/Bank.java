import java.time.LocalDate;

public class Bank {
     public String accountNumber;
     public String agencyNumber;
     public String name;
     public LocalDate birthDate;
     public double Money;

    public Bank(String accountNumber, String agencyNumber, String name, LocalDate birthDate, double inicialMoney) {
        this.accountNumber = accountNumber;
        this.agencyNumber = agencyNumber;
        this.name = name;
        this.birthDate = birthDate;
        this.Money = inicialMoney;
    }

    public void Deposit(double depositAmount) {
        this.Money += depositAmount;
        System.out.println("Deposited " + depositAmount);
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
     }

    public void TransferMoney(double value, Bank accountBank){
        if(value <= 0)
            System.out.println("Insufficient funds!");

        if(value > this.Money){
            System.out.println("Insufficient funds!");
            return;
        }

            this.Money -= value;
            accountBank.Deposit(value);

    }

    List checkExtract(LocalDate inicialDate, LocalDate finalDate){
        return 
    }
}
