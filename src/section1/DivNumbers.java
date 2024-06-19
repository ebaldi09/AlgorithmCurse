package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        String message = "The result of division "+ number1 +" and "+ number2 + " is ";

        System.out.println(message + getDiv(number1, number2));
    }
    // Mi algoritmo
    private static int getDiv(int number1, int number2) {
        int max = number1;
        int result = 0;
        while(max > 0) {
            max -= number2;
            result++;
        }
        return result;
    }

    //Su algoritmo
    private static int getDivFromteacher(int number1, int number2) {
        int result = 0;
        while(number1 > 0) {
            number1 -= number2;
            result++;
        }
        return result;
    }

}
