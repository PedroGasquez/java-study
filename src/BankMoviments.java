import java.time.LocalDate;

public class BankMoviments {

    private LocalDate data;
    private String type;
    private double value;
    private String description;

    public BankMoviments(LocalDate data, String type, double value, String description) {
        this.data = data;
        this.type = type;
        this.value = value;
        this.description = description;
    }

}
