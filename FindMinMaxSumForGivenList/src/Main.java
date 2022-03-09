import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        miniMaxSum(arr);

    }
    
    /*    
    Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
    Then print the respective minimum and maximum values as a single line of two space-separated long integers.    
    */

    //This funciton solves that problem for more than five positive integers
    public static void miniMaxSum(List<Integer> arr) {

        long sum = 0 , temp;
        long [] sums = new long[arr.size()];

        Collections.sort(arr);
        for(int i = 0 ; i < arr.size(); i ++){
            sum = 0;
            temp = (long)arr.get(i) ;
            arr.set(i, 0);

            for(int j = 0 ; j < arr.size(); j ++){
                sum+= (long)arr.get(j);
            }
            sums[i] = sum;
            arr.set(i, (int)temp);

        }
        System.out.print(sums[arr.size() -1 ]);
        System.out.print(" " + sums[0]);
    }
}
