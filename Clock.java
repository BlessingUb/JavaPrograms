import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Clock {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main (String[] args) {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
        
        String formattedTime = currentTime.format(myFormatObj);
        System.out.println("The current" + ANSI_RED + " time" + ANSI_RESET + " is " + formattedTime );
    }
    
}
