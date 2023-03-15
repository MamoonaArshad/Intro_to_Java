import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        String favouriteFood = "pizza";
        int inputtedNum = scanner.nextInt();
        if (inputtedNum < 5) {
             favouriteFood = "Chicken";
            System.out.println("then your favourite food is " + favouriteFood);
        }
        else {
            favouriteFood = "Ketchup chips";
            System.out.println("then your favourite food is " + favouriteFood));
        }


    }
}
