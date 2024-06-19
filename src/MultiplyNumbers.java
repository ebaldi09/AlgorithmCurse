import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        String message = "The result of multiply "+ number1 +" and "+ number2 + " is ";

        System.out.println(message + getMultiply(number1, number2));
    }

    private static int getMultiply(int number1, int number2) {
        int result = 0;
        int count = 0;
        while(count < number2) {
            result += number1;
            count++;
        }
        return result;
    }
}