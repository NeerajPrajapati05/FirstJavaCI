import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

public class hello {
    public static void main(String[] args) {
        // Create a date for January 26, 2026
        LocalDate date = LocalDate.of(2026, 1, 26);
        
        // Print information about January 26
        System.out.println("=== Information about January 26, 2026 ===");
        System.out.println("Date: " + date);
        
        // Get day of week
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of Week: " + dayOfWeek);
        
        // Format the date in different ways
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println("Formatted Date: " + date.format(formatter1));
        
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Short Format: " + date.format(formatter2));
        
        // Additional information
        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());
        System.out.println("Day of Year: " + date.getDayOfYear());
        
        // Check if it's a leap year
        boolean isLeapYear = date.isLeapYear();
        System.out.println("Is 2026 a Leap Year: " + isLeapYear);
    }
}
