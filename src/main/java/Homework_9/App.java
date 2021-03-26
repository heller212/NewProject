package Homework_9;

public class App {

    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"61", "52", "16", "8"},
                {"96", "49", "три", "6"},
                {"78", "3", "4", "56"},
                {"5", "10", "0", "8"}
        };

        try {
            int result = method(arr);
            System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Неправильный размер массива.");
            } catch (MyArrayDataException e) {
                System.out.println("Неправильное значение.");
                System.out.println("В ячейке " + (e.a + 1) + "x" + (e.b + 1) + " должно быть число.");
            }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}