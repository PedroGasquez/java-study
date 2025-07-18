import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankMoviments {

    private LocalDate data;
    private String type;
    private double value;
    private String description;

    public BankMoviments( String type, double value, String description) {
        this.data = LocalDate.now();
        this.type = type;
        this.value = value;
        this.description = description;
    }
    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedValue = String.format("R$ %.2f", this.value);

        // Formato e ordem dos argumentos corrigidos
        return String.format("%s | %-25s | %-12s | %s",
                this.data.format(dtf),  // Mapeia para o 1º %s
                this.type,              // Mapeia para o %-25s
                formattedValue,         // Mapeia para o %-12s
                this.description);      // Mapeia para o último %s
    }

}
