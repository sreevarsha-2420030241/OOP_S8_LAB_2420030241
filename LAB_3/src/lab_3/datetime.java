package lab_3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class datetime {
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eventDateTime = LocalDateTime.parse(input, formatter);
        LocalDateTime now = LocalDateTime.now();
         if (eventDateTime.isBefore(now)) 
         {
            System.out.println("The event date and time has already passed.");
         } 
         else 
         {
            Duration duration = Duration.between(now, eventDateTime);
            long totalMinutes = duration.toMinutes();
            long days = totalMinutes / (24 * 60);
            long hours = (totalMinutes % (24 * 60)) / 60;
            long minutes = totalMinutes % 60;
            System.out.println("Time remaining until event:");
            System.out.println("\t" + days + " days, " + hours + " hours, and " + minutes + " minutes");
        }
        scanner.close();
    }
}
