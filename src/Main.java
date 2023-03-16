import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void teaWithMe() {
        String teaCollection = "Chamomille, Mango, Black, Aloe";
        System.out.println("Would you like some tea with me?");
        System.out.println("Type in yes or yes");
        Scanner userAnswer = new Scanner(System.in);
        userAnswer.next();
        System.out.println("Welcome to my tea collection  " + teaCollection );
        System.out.println("What would you like");
        Scanner userTeaChoice = new Scanner(System.in);
        userTeaChoice.next();
        System.out.println("Coming right away!");

        //so far I have only defined the function and if I run the script it runs nothing

    }

    public static void main(String[] args){

    }
};












//Implement a multiple choice question:
//One question, three answer choices where one is correct
//Ask the user a question and provide the question choices to user
//the user will respond and we will collect their answer
//print out the appropriate message to the user