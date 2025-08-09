package lab_4;

public class student 
{
    private int rollnumber;     
    protected char grade;       
    public String name;         
    public void setDetails(int roll, char g, String n) 
    {
        rollnumber = roll;
        grade = g;
        name = n;
    }
    public void showDetails() 
    {
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
    }
}
