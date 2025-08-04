package lab_1;
import java.util.Scanner;
public class add {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double morningShiftEarnings = sc.nextDouble();
	        double eveningShiftEarnings = sc.nextDouble();
	        double totalDailyEarnings = morningShiftEarnings + eveningShiftEarnings;
	        System.out.println("Total earnings for the day: ₹" + totalDailyEarnings);
	    }
	
}
