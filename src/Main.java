import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static double fullMeal(double priceOfTheMeal, double taxPercentage, double tipPercentage) {
        //here we declare the variables we are going to be using.
        //The variable must always be declared in the round paranthesis as a list

        double tipPrice = tipPercentage * priceOfTheMeal;
        double taxPrice = taxPercentage * priceOfTheMeal;
        double totalPrice = priceOfTheMeal  + tipPrice + taxPrice;
        return totalPrice; //this will allow us to access the variable of the function for a different scope, it thus become kind of as an independent variable
    }

    public static void main(String[] args){
       double groupTotalMealPrice = fullMeal(36, .20, .8);
       //add directly the number in order
        int numberOfPeople = 6;
        double individualMealPrice = groupTotalMealPrice/numberOfPeople;
        System.out.println(individualMealPrice);



    }
};













