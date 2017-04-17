import java.sql.Time;
import java.text.ParseException;

public class CalenderExample {
    public static void main(String[] args) throws ParseException {

        String currentTime = "07:45:00";

        String startTime = "07:30:00";

        String stopTime = "08:30:00";

        Time t = Time.valueOf(currentTime);
        System.out.println("Time: " + t);
        t.compareTo(t);

        System.out.println((Time.valueOf(currentTime)).compareTo(Time.valueOf(currentTime)));

        System.out.println((Time.valueOf(currentTime)).compareTo(Time.valueOf(startTime)));

        System.out.println((Time.valueOf(currentTime)).compareTo(Time.valueOf(stopTime)));

    }
}
