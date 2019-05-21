import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100);
        Scanner myInput = new Scanner(System.in);
        int myGuess;
        int maxValue = 100;
        int minValue = 1;

        do {
            myGuess = myInput.nextInt();
            if (myGuess == randomNumber) {
                System.out.println("You guessed!");
            } else if (myGuess > randomNumber) {
                maxValue = myGuess;
                System.out.println("Your guess is bigger, number is between " + minValue + " and " + maxValue);
            } else {
                minValue = myGuess;
                System.out.println("Your guess is smaller, number is between " + minValue + " and " + maxValue);

            }
        } while (myGuess != randomNumber);
    }


}
