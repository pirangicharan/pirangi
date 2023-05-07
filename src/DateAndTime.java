import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {


        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Create a specific date and time
        LocalDateTime dateTime = LocalDateTime.of(2022, Month.JANUARY, 1, 0, 0, 0);

        // Add two hours to the date and time
        LocalDateTime newDateTime = dateTime.plusHours(2);

        // Format the date and time as a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy \nHH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Print the formatted date and time
        System.out.println(formattedDateTime);

    }
}
