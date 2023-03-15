import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        //char studentFirstInitial = 'k';
        char studentLatInitial = 'H';
        boolean hasPerfectAttendance = true;
        String studentFirstName = "Kayla ";
        String studentLastName = "Hammon";
        char studentFirstInitial = studentFirstName.charAt(0);

        System.out.println(studentFirstName + "" + studentLastName +  " has a GPA of " + studentGPA);
        System.out.println("What do you want to update ut to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println("your GPA has been updated to " + studentGPA);  //the update of course is not stored internally

    }
}
