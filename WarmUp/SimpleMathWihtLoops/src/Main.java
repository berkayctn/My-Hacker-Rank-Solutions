import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        scanner.close();

    }
}