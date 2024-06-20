package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class isFriendNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        String message = "The number "+ number1 + " is friend than " + number2 + " ? ";

        System.out.println(message + (areFriends(number1, number2) ? "yes" : "no"));
    }

    //Mi algoritmo
    private static boolean areFriends(int number1, int number2) {
        ArrayList<Integer> divisors1 = getDivisors(number1);
        ArrayList<Integer> divisors2 = getDivisors(number2);
        int sumOfDivisors1 = getSumOfDivisors(divisors1);
        int sumOfDivisors2 = getSumOfDivisors(divisors2);

        return sumOfDivisors1 == number2 && sumOfDivisors2 == number1;
    }

    //Su algoritmo
    private static boolean isFriendsTeacher(int a, int b) {
        int sumA = 0;
        for (int i = 1; i < a/2; i++) {
            if(a % i == 0) sumA += i;
        }

        int sumB = 0;
        for (int i = 1; i < b/2; i++) {
            if(b % i == 0) sumB += i;
        }

        if((a == sumB) && (b == sumA))
            return true;
        else
            return false;
    }

    private static int getSumOfDivisors(ArrayList<Integer> divisors) {
        int sum = 0;
        for(int divisor : divisors) {
            sum += divisor;
        }
        return sum;
    }

    private static ArrayList<Integer> getDivisors(int number1) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}