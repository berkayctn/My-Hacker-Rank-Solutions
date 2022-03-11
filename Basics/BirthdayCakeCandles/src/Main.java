import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);

        System.out.println(birthdayCakeCandles(arr));

    }

    public static int birthdayCakeCandles(List<Integer> candles) {

        int biggestCandle = 0;

        Collections.sort(candles);
        for (Integer candle : candles) {
            if (candles.get(candles.size() -1 ).equals(candle)) {
                biggestCandle++;
            }
        }

        return biggestCandle;
    }

}
