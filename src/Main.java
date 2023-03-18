import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void fullMeal(double priceOfTheMeal, double taxPercentage, double tipPercentage) {
        //here we declare the variables we are going to be using.
        //The variable must always be declared in the round paranthesis as a list

        double tipPrice = tipPercentage * priceOfTheMeal;
        double taxPrice = taxPercentage * priceOfTheMeal;
        double totalPrice = priceOfTheMeal  + tipPrice + taxPrice;
        System.out.println((totalPrice));
    }

    public static void main(String[] args){
        fullMeal(22, 0.8, 0.9); //add directly the number in order



    }
};












//Implement a multiple choice question:
//One question, three answer choices where one is correct
//Ask the user a question and provide the question choices to user
//the user will respond and we will collect their answer
//print out the appropriate message to the user