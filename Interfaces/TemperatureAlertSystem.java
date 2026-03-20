
import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Predicate<Double> alert = temp -> temp > 40;
        double temperature = 42.5;

        if(alert.test(temperature)) {
            System.out.println("Temperature Alert!");
        }
    }
}
