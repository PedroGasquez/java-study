import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Bank contaDoPedro = new Bank("829", "123", "Pedro", LocalDate.of(2002, 7, 16), 500);
        Bank contaDoJoao = new Bank("759", "123", "Joao", LocalDate.of(1993, 4, 23), 300);

        contaDoJoao.Withdraw(100);
        contaDoPedro.Deposit(200);
        contaDoJoao.TransferMoney(150, contaDoJoao);

        contaDoPedro.impressExtract();
        contaDoJoao.impressExtract();
    }
}