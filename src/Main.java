public class Main {
    public static double salaryInput(double totalNumberOfHours, double raterPerHour, double vacationHours){
        double grossSalary = (totalNumberOfHours - vacationHours) * raterPerHour;
        return grossSalary;


    };

    public static void main(String[] args) {
        double finalSalary = salaryInput(1103, 25, 8 * 25);
        System.out.println(finalSalary);



    }
};
















