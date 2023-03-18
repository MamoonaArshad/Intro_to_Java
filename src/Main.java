public class Main {
    public static double salaryInput(double numberOfHours, double raterPerHour){
        double grossSalary = numberOfHours * raterPerHour;
        return grossSalary;


    };

    public static void main(String[] args) {
        double finalSalary = salaryInput(103, 25);
        System.out.println(finalSalary);



    }
};
















