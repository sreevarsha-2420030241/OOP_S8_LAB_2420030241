package lab_1;

import java.util.Scanner;

public class c_to_f {
	public static void main(String[] arg) {
		  int f;
		  System.out.println("Enter the temp: ");
		  Scanner sc =new Scanner(System.in);
		  f = sc.nextInt();
		  int c = (f-32)*5/9;
		  System.out.println("The temp in c= "+c);
		  
		 }
}
