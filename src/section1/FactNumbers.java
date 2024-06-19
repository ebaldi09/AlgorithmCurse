package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        String message = "The result of factorial "+ number1 + " is ";

        System.out.println(message + getFact(number1));
    }
    //Mi algoritmo
    private static int getFact(int number1) {
        int value = 1;
        int factorial = 1;
        while(factorial <= number1) {
            value *= factorial;
            factorial++;
        }
        return value;
    }

    //Su algoritmo
    private static int getFactTeacher(int number1) {
        int value = 1;
        for (int i = 1; i <= number1; i++) {
            value *= i;
            i++;
        }
        return value;
    }
}
