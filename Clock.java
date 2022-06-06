import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Clock {
    public static void main (String[] args) {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
        
        String formattedTime = currentTime.format(myFormatObj);
        System.out.println("The current time is " + formattedTime );
    }
    
}
