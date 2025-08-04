package lab_1;

import java.util.Scanner;

public class Volumeofsphere {
	public static void main(String[] args) 
	 {
	  // TODO Auto-generated method stub
	  int r;
	  float pi=3.14f;
	  System.out.println("Enter the radius");
	  Scanner sc=new Scanner(System.in);
	  r=sc.nextInt();
	  System.out.println("volume of sphere is:" +(4/3*pi*r*r));
	 }
}
