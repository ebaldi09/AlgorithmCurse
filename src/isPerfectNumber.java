import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class isPerfectNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        String message = "The number "+ number1 + " is perfect ? ";

        System.out.println(message + (isPerfect(number1) ? "yes" : "no"));
    }

    //Mi algoritmo
    private static boolean isPerfect(int number1) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                divisors.add(i);
            }
        }
        int sum = 0;
        for(int divisor : divisors) {
            sum += divisor;
        }
        return sum == number1;
    }

    //Su algoritmo
    private static boolean isPerfectTeacher(int number1) {
        int result = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                result += i;
            }
        }
        return result == number1;
    }
}