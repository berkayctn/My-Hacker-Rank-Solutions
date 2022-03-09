import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        plusMinus(arr);


    }
    
    
    //Find the ratio of positive numbers,negative numbers and zeros for given array.
    

    public static void plusMinus(List<Integer> arr) {

        int zero = 0, positive = 0, negative = 0;
        
        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) < 0) {
                negative++;

            } else if (arr.get(i) == 0) {
                zero++;

            } else
                positive++;
        }

        System.out.printf("proportion of positive values: %.6f %n", ((double) positive / arr.size()));
        System.out.printf("proportion of negative  values: %.6f %n", ((double) negative / arr.size()));
        System.out.printf("proportion of zeros : %.6f %n", ((double) zero / arr.size()));

    


    }
}














