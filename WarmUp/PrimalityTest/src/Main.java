import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.nextLine());

       if(n.isProbablePrime(100)){
           System.out.println(n + " is a prime number");
        }else {
           System.out.println(n + " is not a prime number");
       }


    }

}
