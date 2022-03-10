import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 3;
        while (i > 0) {
            int myInt = scanner.nextInt();
            System.out.println(myInt);
            i--;
        }

        scanner.close();
    }
}
