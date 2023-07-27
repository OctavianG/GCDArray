import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // finding the GCD of two numbers
    // Version of Euclidean algorithm
    // Time complexity - O(log min(number1, number2))
    public static int GCD(int number1, int number2) {

        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) {
                number1 = number1 % number2;
            } else {
                number2 = number2 % number1;
            }
        }

        return Math.max(number1, number2);
    }

    // Determines the GCD of the elements in the array
    // The min and max elements in the array are found
    // GCD method called for min and max
    // Time complexity - O(log min(min, max))
    public static int findGCD(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        //applying the GCD method for two numbers
        return GCD(min, max);
    }


    public static void main(String[] args) {

        int[] array = new int[]{7, 5, 6, 8, 3};

        System.out.println(findGCD(array));
    }
}