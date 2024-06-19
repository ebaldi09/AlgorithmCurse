import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowersNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        String message = "The result of powers "+ number1 +" and "+ number2 + " is ";

        System.out.println(message + getPow(number1, number2));
    }
    //Mi algoritmo
    private static int getPow(int number1, int number2) {
        int intialValue = number1;
        int count = 1;
        while(count < number2) {
            number1 *= intialValue;
            count++;
        }
        return number1;
    }

    //Su algoritmo
    private static int getPowTeacher(int number1, int number2) {
        int value = 1;
        while(number2 > 0) {
            value *= number1;
            number2--;
        }
        return value;
    }
}