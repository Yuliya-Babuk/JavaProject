
package lesson2;

import java.util.Arrays;
import java.util.OptionalInt;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(within10and20(3, 15));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-5));
        printWordNTimes("Nice day", 5);
        reverseElementsInArray(new int[]{0, 1, 1, 0, 1});
        fillArray();
        multiplyBy2IfLessThen6(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        fillDiagonal();
        int[] array = createAndInitializeArray(4, 5);
        //offsetArray(new int[]{0, 1, 2, 3, 4}, 3);
    }

    private static int[] createAndInitializeArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
        return array;
    }

    private static void fillDiagonal() {
        int[][] array = new int[3][3];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                if (i == j || i + j == array.length - 1)
                    array[i][j] = 1;
                else array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void multiplyBy2IfLessThen6(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void printWordNTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    private static void reverseElementsInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                array[i] = 1;
            else array[i] = 0;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static boolean isNegative(int x) {
        return x < 0;
    }

    private static boolean within10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println(x + " is positive");
        } else {
            System.out.println(x + " is negative");
        }
    }
}

