package lesson6;

public class HomeWork6 {
    public static void main(String[] args) {
        try {
            int sum = StringToIntArray.findSum(new String[][]{{"1", "2", "3", "5"}, {"3", "0", "2", "5"}
                    ,{"1", "2", "3", "5"}, {"4", "4", "5", "6"}});
            System.out.println("Sum: " + sum);
        } catch (MyArraySizeException|MyArrayDataException e) {
            System.out.println(e);
        }

    }
}

class StringToIntArray {
    public static int findSum(String[][] stringsArr) throws MyArraySizeException, MyArrayDataException {
        if (!(stringsArr.length == 4 && stringsArr[0].length == 4))
            throw new MyArraySizeException();
        int intArray;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    intArray = Integer.parseInt(stringsArr[i][j]);
                    sum += intArray;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("["+i+"]["+j+"]");
                }
            }
        }
        return sum;
    }
}

class MyArraySizeException extends Exception {
    public String toString() {
        return "Wrong array size, sum can not be calculated";
    }
}

class MyArrayDataException extends NumberFormatException {
    private String cellNumber;

    public String getCellNumber() {
        return cellNumber;
    }
    public MyArrayDataException(String cellNumber) {
        this.cellNumber = cellNumber;
    }
    public String toString() {
        return "In the cell " + getCellNumber() + " is not integer type, sum can not be calculated";
    }
}
