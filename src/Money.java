import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Savina on 3.2.2018 г..
 */
public class Money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> money = Arrays.asList(200, 100, 50, 20, 10, 5, 2, 1);

        Integer sum = (int) (Double.parseDouble(input.nextLine()) * 100);
        int counterOfCoins = 0;
        int indexOfCoin=0;
        Integer value = 0;
        do {
            value=money.get(indexOfCoin++);
            counterOfCoins += sum / value;
            sum=sum%value;
        } while (sum % value != 0);
        System.out.println(counterOfCoins);


    }
}
