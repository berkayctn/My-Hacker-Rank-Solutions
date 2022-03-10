import java.util.List;

public class Main {

    public static void main(String[] args) {


    }
    
    //Given a square matrix, calculate the absolute difference between the sums of its diagonals.

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).get(i);
            sum -= arr.get(i).get((arr.size() - i) - 1);
        }

        return Math.abs(sum);
    }
}
