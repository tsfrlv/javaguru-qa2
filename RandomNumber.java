import java.util.Random;
import java.util.Scanner;

public class RandomNumber {


    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(9);
        int number2 = random.nextInt(9);
        int number3 = random.nextInt(9);

        int sum = number1 + number2 + number3;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        System.out.println("My sum is " + sum);

        int dice1;
        int dice2;
        int dice3;
        int tries = 0;

        do {

            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            dice3 = (int) (Math.random() * 6) + 1;

            System.out.println(dice1);
            System.out.println(dice2);
            System.out.println(dice3);

            ++tries;
            System.out.println("It took me " + tries);
        }
        while ((dice1 != dice3) || (dice2 != dice3));

        Scanner myInput = new Scanner(System.in);
        int myAnswer;
        int maxValue = 101;
        int minValue = 1;
        int randomNumber = (int) (Math.random() * maxValue);


        do {
            System.out.println(randomNumber);
            myAnswer = myInput.nextInt();

            if (myAnswer == 1) {
                minValue = randomNumber + 1;
                randomNumber = (int) (Math.random() * ((maxValue - minValue))) + minValue;
            } else if (myAnswer == 2) {
                maxValue = randomNumber;
                randomNumber = (int) (Math.random() * ((maxValue - minValue))) + minValue;
            } else if (myAnswer == 0) {
                System.out.println("Yay!");
            }

        } while (myAnswer != 0);

    }


}
