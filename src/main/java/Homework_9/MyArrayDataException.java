package Homework_9;

public class MyArrayDataException extends NumberFormatException {
    public int a;
    public int b;

    MyArrayDataException(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
