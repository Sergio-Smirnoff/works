package backend;

import java.time.LocalDateTime;

public class Import {

    private final double amount;
    private final LocalDateTime time;
    private final String description;
    public Import(double amount, String desc, LocalDateTime time){
        if ( amount < 0 ) // chequeo que no se ingrese un monto invalido
            throw new IllegalArgumentException("Wrong amount asigned!");
        this.description = desc;
        this.amount = amount;
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public String toString(){
        return amount + "-" + time + "-" + description;
    }
}
