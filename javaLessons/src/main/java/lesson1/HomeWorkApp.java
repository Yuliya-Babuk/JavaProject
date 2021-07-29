package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a=0, b=-1;
        if (a<=b) System.out.println("a<=b"); System.out.println("a>b");
    }

    private static void printColor() {
        int value = 100;
        String result = value<=0?"Red":value>0&&value<=100?"Yellow":"Green";
            System.out.println(result);

    }

    private static void checkSumSign() {
        int a=0, b=-1;
        if (a+b>=0)
            System.out.println("Sum is positive");
            System.out.println("Sum is negative");
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
}
