import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGuay {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        String message = "Number "+ number1 +" is guay? ";

        System.out.println(message + (isGuay(number1) ? "yes" : "no"));
    }

    private static boolean isGuay(int number1) {
        int result = 0;
        int count = 1;
        while (result < number1){
            result += count;
            count++;
        }
        return result == number1;
    }

    private static boolean isGuayTeacher() {
        int number = 15;
        int value = 0;
        boolean guay = false;
        for (int i=1; i<number && guay == false; i++){
            value += i;
            if (value == number) guay = true;
        }
        return guay;
    }
}