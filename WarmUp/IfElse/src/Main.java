import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if ((n % 2 != 0 ) || ((n >= 6 && n <= 20))){
            System.out.println("Weird");
        }else if(n >= 2){
            System.out.println("Not Weird");
        }

    }
}
