import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Current song playing");
            System.out.println("Would you like to play next song");
            // not needed as variable defined in scope scanner Scanner = new Scanner(System.in);
            String userInput = scanner.next();
            if (userInput.equals("Yes")) {
                isOnRepeat = false;
                System.out.println("Next song is playing");
            }
            }
        }

    }





