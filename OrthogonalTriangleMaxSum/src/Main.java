import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    //Initialize Array with the number of lines the Input has
    private final static int[][] pyramid = new int[4][4];

    public static void main(String[] args) {

        //Fill the array with your Input
        //You need to write your Input path
        readNums("C:\\Users\\berkay\\IdeaProjects\\OrthogonalTriangleMaxSum\\src\\test1.txt");

        //Set all primes to 0
        primesToZero();

        //Find max sum and store max in first position
        findMaxSum();

        //Print result
        System.out.println("\nArray after max sum calculations: ");
        printArray();
        System.out.println("\n-------------- The max sum is " + pyramid[0][0] + " --------------");
    }


    private static void readNums(String filePath) {
        int index = 0;
        try {
            InputStream inStream = new FileInputStream(filePath);
            Scanner scanner = new Scanner(inStream);


            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] numbers = s.split("\\s+");

                for (int i = 0; i < numbers.length; i++) {
                    pyramid[index][i] = Integer.parseInt(numbers[i]);
                }
                index++;
            }

        } catch (Exception e) {
            System.out.println("An error occurred while filling the array");
            java.lang.System.exit(1);
        }
    }

    //Prime Number Check
    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    // Set all prime numbers in the array to 0
    private static void primesToZero() {
        for (int r = 0; r < pyramid.length; r++) {
            for (int c = 0; c < pyramid[0].length; c++) {
                if (isPrime(pyramid[r][c])) {
                    pyramid[r][c] = 0;
                }
            }
        }
    }

    /**
     * Find the max sum according to the rules defined in the problem.
     * It Checks numbers directly below and to the right to accumulate max into first pos of arr.
     */
    private static void findMaxSum() {
        int largestColIndex = pyramid[0].length - 1;

        for (int i = pyramid.length - 1; i > 0; i--) {
            for (int j = 0; j < largestColIndex; j++) {
                if (pyramid[i][j] == 0 && pyramid[i][j + 1] == 0) {
                    pyramid[i - 1][j] = 0;
                } else {
                    pyramid[i - 1][j] += Math.max(pyramid[i][j], pyramid[i][j + 1]);
                }
            }
            largestColIndex--;
        }
    }

    private static void printArray() {
        for (int r = 0; r < pyramid.length; r++) {
            for (int c = 0; c < pyramid[0].length; c++) {
                System.out.print(pyramid[r][c] + " ");
            }
            System.out.print("\n");
        }
    }
}
