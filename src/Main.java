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

        System.out.println(studentFirstName + "" + studentLastName +  " has a GPA of" + studentGPA);
    }
}