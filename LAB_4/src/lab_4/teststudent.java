package lab_4;

public class teststudent {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setDetails(241, 'A', "Sreevarsha");

        s1.rollnumber = 241; // ❌ This will now give an error: rollnumber has private access in student

        s1.showDetails();
    }
}
