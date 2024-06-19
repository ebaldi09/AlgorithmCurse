import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isPrimeNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        String message = "The number "+ number1 + " is prime ? ";

        System.out.println(message + (isPrime(number1) ? "yes" : "no"));
    }
    //Mi algoritmo
    private static boolean isPrime(int number1) {
        boolean isPrime = true;
        for (int i = 2; i < number1; i++) {
            if (number1 % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    //Su algoritmo
    private static boolean isPrimeTeacher(int number1) {
        boolean isPrime = true;
        for (int i = 2; i < number1 / 2 && isPrime; i++) {
            if (number1 % i == 0) isPrime = false;
        }
        return isPrime;
    }
}