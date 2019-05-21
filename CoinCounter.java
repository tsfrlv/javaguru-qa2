import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinCounter {

    public static void main(String[] args) {
        int availableCoins[];
        List<String> result = new ArrayList<>();

        availableCoins = new int[]{200, 100, 50, 20, 10, 5, 2, 1};
        Scanner myInput = new Scanner(System.in);
        int myMoney = myInput.nextInt();

        int i = 0;
        do {
            int numberOfCoins = myMoney / availableCoins[i];
            myMoney = myMoney % availableCoins[i];
            if (numberOfCoins != 0) {
                result.add(getCoinNames(availableCoins[i]).concat(" x " + numberOfCoins));
            }
            ++i;
        } while (myMoney != 0);


        System.out.print(result);

    }

    private static String getCoinNames(int coin) {
        if (coin == 100) {
            return "1 Euro coin";
        } else if (coin == 200) {
            return "2 Euro coin";
        } else if (coin == 1) {
            return "1 cent coin";
        } else {
            return Integer.toString(coin).concat(" cents coin");
        }
    }
}
