import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String question = "When is Wife's Birthday?";
        String answer1 = "1: 3 September";
        String answer2 = "2: 4 September";
        String answer3 = "3: 9 September";
        System.out.println(question);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        Scanner answer = new Scanner (System.in);
        System.out.println("Write here the answer: " );
        String userInput = answer.next();
        if(userInput.equals("1")){
            System.out.println("Bravo!");
        }
        else{
            System.out.println("Cafone!");

        }
            }

        };












//Implement a multiple choice question:
//One question, three answer choices where one is correct
//Ask the user a question and provide the question choices to user
//the user will respond and we will collect their answer
//print out the appropriate message to the user