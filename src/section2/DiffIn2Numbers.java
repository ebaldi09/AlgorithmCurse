package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DiffIn2Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
      int firstInput = Integer.parseInt(reader.readLine());
      int secondInput = Integer.parseInt(reader.readLine());
        String message = "The difference from "+ firstInput +" and "+ secondInput + " is ";
        System.out.println(message + getSub(firstInput, secondInput));
    }

    private static int getSub(int number1, int number2) {

        int diff = 0;
        while(number1 > number2) {
            number2++;
            diff++;
        }
        return diff;
    }
}