import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDate dataPedroBirth = LocalDate.of(2002, 7, 16);

        Bank contaDoPedro = new Bank("829", "123", "Pedro", dataPedroBirth, 500);

        contaDoPedro.Deposit(300);
    }
}